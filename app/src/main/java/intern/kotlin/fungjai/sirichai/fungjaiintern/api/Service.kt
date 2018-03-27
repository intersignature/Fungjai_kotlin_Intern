package intern.kotlin.fungjai.sirichai.fungjaiintern.api

import intern.kotlin.fungjai.sirichai.fungjaiintern.pojo.MusicData
import intern.kotlin.fungjai.sirichai.fungjaiintern.utilities.Constants
import retrofit2.Call
import retrofit2.http.GET

interface Service {

    @GET(Constants.MUSIC_LIST)
    fun getMusicList(): Call<List<MusicData>>
}