package intern.kotlin.fungjai.sirichai.fungjaiintern.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import intern.kotlin.fungjai.sirichai.fungjaiintern.R
import intern.kotlin.fungjai.sirichai.fungjaiintern.controller.DataController

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configRecyclerView()

        val dataController = DataController(applicationContext, recyclerView)
        dataController.getData()
    }

    private fun configRecyclerView() {
        recyclerView = findViewById(R.id.showDataRV)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
    }
}
