package com.example.hiltwithwithoutmvvmapp.hilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
class UserModule {
/*
 @Provides
     fun providesUserRepository(): UserRepository {
         return FirebaseRepository()
     }


    // this is binding for constructor injected SQLRepository
   @Provides
       fun providesUserRepository(sqlRepository: SQLRepository): UserRepository {
           return sqlRepository
       }


    // OR
  @Named("sql")
      @Binds
      abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository

*/


    @Named("sql")  // qualifiers
    @Provides
    fun providesSqlRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    @FirebaseQualifier
//    @Named("firebase")
    @Provides
    fun providesFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }
}
