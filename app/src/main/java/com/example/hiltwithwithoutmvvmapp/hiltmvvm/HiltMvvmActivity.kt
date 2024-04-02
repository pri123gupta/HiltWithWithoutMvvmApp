package com.example.hiltwithwithoutmvvmapp.hiltmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.hiltwithwithoutmvvmapp.R
import com.example.hiltwithwithoutmvvmapp.hiltmvvm.viewmodels.MainViewModel
import com.example.hiltwithwithoutmvvmapp.ui.theme.HiltWithWithoutMvvmAppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import kotlin.text.Typography.dagger

@AndroidEntryPoint
class HiltMvvmActivity : ComponentActivity() {

    lateinit var vm: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        vm = ViewModelProvider(this).get(MainViewModel::class.java)
        vm.productsLiveData.observe(this, Observer {
          val text = it.joinToString { x -> x.title + "\n" }
        setContent {
            HiltWithWithoutMvvmAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android 4656576 \n  $text")
                }
            }
        }
        })
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HiltWithWithoutMvvmAppTheme {
        Greeting("Android")
    }
}