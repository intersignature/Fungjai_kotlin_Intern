package intern.kotlin.fungjai.sirichai.fungjaiintern

import intern.kotlin.fungjai.sirichai.fungjaiintern.api.FungjaiInternApiManager
import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.IOException


class ServiceTest {

    @Test
    @Throws(IOException::class)
    fun resultSizeTest() {
        val service = FungjaiInternApiManager().getFungjaiInternApi()
        val musicListData = service!!.getMusicList().execute().body()!!
        assertEquals(8, musicListData.size)
    }
}