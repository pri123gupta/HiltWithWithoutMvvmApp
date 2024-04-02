package com.example.hiltwithwithoutmvvmapp.hilt

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hiltwithwithoutmvvmapp.ui.theme.HiltWithWithoutMvvmAppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class HiltActivity : ComponentActivity() {

    val MY_TAG = "PriyankaGupta"

//    @Named("firebase")
    @FirebaseQualifier // user-defined qualifiers
    @Inject
    lateinit var userRepository: UserRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(MY_TAG, "on create 232323")
        if (::userRepository.isInitialized) {

            Log.d(MY_TAG, "  init")
            userRepository.saveUser("221121@j84u8gmail.c", "==--=-=")
        } else {
            Log.d(MY_TAG, "not init")
        }
        setContent {
            HiltWithWithoutMvvmAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android 4656576")
                }
            }
        }
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
