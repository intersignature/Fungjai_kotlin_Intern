package intern.kotlin.fungjai.sirichai.fungjaiintern.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import intern.kotlin.fungjai.sirichai.fungjaiintern.R

class FungjaiInternRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val coverZineImg: ImageView? = itemView.findViewById(R.id.coverZineImg)
    val titleZineTv: TextView? = itemView.findViewById(R.id.titleZineTv)
    val descriptionZineTv: TextView? = itemView.findViewById(R.id.descriptionZineTv)

    val coverTrackImg: ImageView? = itemView.findViewById(R.id.coverTrackImg)
    val songTrackTv: TextView? = itemView.findViewById(R.id.songTrackTv)
    val artistTrackTv: TextView? = itemView.findViewById(R.id.artistTrackTv)
}