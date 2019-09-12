package com.jnfran92.model.supplier.cloud

import com.jnfran92.model.entity.CryptoEntity
import com.jnfran92.model.entity.api.DefaultApiRequestEntity
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

/**
 * Retrofit declaration for consuming Crypto API
 */
interface CryptoRetrofitService {

//    @Headers({"Cache-Control: max-age=640000", "User-Agent: My-App-Name"})
    @GET("/v1/cryptocurrency/listings/latest")
    fun requestCrypto(@Path("id") cryptoId:Int): Call<DefaultApiRequestEntity<CryptoEntity>>

    @GET("/v1/cryptocurrency/listings/latest")
    fun requestCryptoList(): Call<DefaultApiRequestEntity<CryptoEntity>>
}