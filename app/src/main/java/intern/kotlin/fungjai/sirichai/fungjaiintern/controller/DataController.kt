package intern.kotlin.fungjai.sirichai.fungjaiintern.controller

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import intern.kotlin.fungjai.sirichai.fungjaiintern.api.FungjaiInternApiManager
import intern.kotlin.fungjai.sirichai.fungjaiintern.pojo.MusicData
import intern.kotlin.fungjai.sirichai.fungjaiintern.recyclerview.FungjaiInternRecyclerViewAdapter
import intern.kotlin.fungjai.sirichai.fungjaiintern.recyclerview.FungjaiInternRecyclerViewHolder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataController(private var context: Context, private var recyclerView: RecyclerView) : Callback<List<MusicData>> {

    private lateinit var datas: List<MusicData>
    private lateinit var adapeter: RecyclerView.Adapter<FungjaiInternRecyclerViewHolder>

    fun getData() {
        datas = ArrayList()
        val dataModel: Call<List<MusicData>> = FungjaiInternApiManager().getFungjaiInternApi()!!.getMusicList()
        dataModel.enqueue(this)
    }

    override fun onResponse(call: Call<List<MusicData>>, response: Response<List<MusicData>>) {
        datas = response.body()!!
        adapeter = FungjaiInternRecyclerViewAdapter(datas, context)
        recyclerView.adapter = adapeter
        Toast.makeText(context, "success", Toast.LENGTH_SHORT).show()
    }

    override fun onFailure(call: Call<List<MusicData>>?, t: Throwable?) {
        Toast.makeText(context, "fail", Toast.LENGTH_SHORT).show()
    }
}
