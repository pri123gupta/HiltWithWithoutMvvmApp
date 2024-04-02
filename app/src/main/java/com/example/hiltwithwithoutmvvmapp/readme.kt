package com.example.hiltwithwithoutmvvmapp
/* To switch
1. switch application named class in manifest, & launcher activity
2. comment annotation on another application class
* */
/*
For classes -  constructor inject
for interfaces / abstract class- provide implementation,
 we cannot use "@Inject" , so we use modules, to get implementation

binds- whenever we have to bind an interface to its implementation we use binds....,
 we can use provides also, but binds is recommended.
 When we have multiple implementations(multiple provides), we apply qualifiers, to distinguish which method will run.
*/

/*Advantage of hilt :
We need not to create factory(when we need parameter in viewmodel)
* */
/* HILT + MVVM
1. Application class
@HiltAndroidApp
class FakerApplication
spi interface, modules,

2. Android entry point annotation on views(activity fragments)
@AndroidEntryPoint
class HiltMvvmActivity

3. Viewmodel (creates factory behind the scene)
@HiltViewModel
class MainViewModel

 */