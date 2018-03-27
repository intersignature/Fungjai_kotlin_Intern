package intern.kotlin.fungjai.sirichai.fungjaiintern.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.BitmapImageViewTarget
import intern.kotlin.fungjai.sirichai.fungjaiintern.R
import intern.kotlin.fungjai.sirichai.fungjaiintern.pojo.MusicData

class FungjaiInternRecyclerViewAdapter(var datas: List<MusicData>, var context: Context) : RecyclerView.Adapter<FungjaiInternRecyclerViewHolder>() {

    override fun onBindViewHolder(holder: FungjaiInternRecyclerViewHolder, position: Int) {
        val musicData: MusicData = datas.get(position)
        if (musicData.type == "zine") {
            holder.titleZineTv?.text = musicData.title
            holder.descriptionZineTv?.text = musicData.description
            Glide.with(context).asBitmap().load(musicData.cover).apply(RequestOptions().error(R.drawable.ic_launcher_background)).into(object : BitmapImageViewTarget(holder.coverZineImg) {
            })
        } else {
            holder.songTrackTv?.text = musicData.song
            holder.artistTrackTv?.text = musicData.artist
            Glide.with(context).asBitmap().load(musicData.cover).apply(RequestOptions().error(R.drawable.ic_launcher_background)).into(object : BitmapImageViewTarget(holder.coverTrackImg) {
            })
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FungjaiInternRecyclerViewHolder {
        val v: View = if (viewType == 0) {
            LayoutInflater.from(context).inflate(R.layout.zine_item, parent, false)
        } else LayoutInflater.from(context).inflate(R.layout.track_item, parent, false)
        return FungjaiInternRecyclerViewHolder(v)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (datas[position].type == "zine") {
            0
        } else 1
    }
}
