package intern.kotlin.fungjai.sirichai.fungjaiintern.pojo

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class MusicDataTest {

    private lateinit var musicData: MusicData

    @Before
    fun setUp() {
        musicData = MusicData()
    }

    @Test
    fun artistGetSetTest() {
        val artist = MusicData("markmywords.", null, null, null, null, null, null)
        assertEquals("markmywords.", artist)
    }

    @Test
    fun coverGetSetTest() {
        val cover = MusicData(null, "https://image.fungjai.com/2018/02/12/cover/1518429706726234.jpg", null, null, null, null, null)
        assertEquals("https://image.fungjai.com/2018/02/12/cover/1518429706726234.jpg", cover)
    }

    @Test
    fun songGetSetTest() {
        val song = MusicData(null, null, "น้องสาวครับ (Sister)", null, null, null, null)
        assertEquals("น้องสาวครับ (Sister)", song)
    }

    @Test
    fun typeGetSetTest() {
        val type = MusicData(null, null, null, "track", null, null, null)
        assertEquals("track", type)
    }

    @Test
    fun descriptionGetSetTest() {
        val description = MusicData(null, null, null, null, "Fungjaizine ขอเชิญทุกท่านมาทำความรู้จัก แก้ว และ ตาหวาน 2 สมาชิกจากแก๊งชราไลน์แห่ง BNK48 กับเรื่องราวการไปเล่นดนตรีที่ญี่ปุ่นและชีวิตที่ทั้งคู่ไม่เคยเปิดเผยที่ไหนมาก่อน", null, null)
        assertEquals("Fungjaizine ขอเชิญทุกท่านมาทำความรู้จัก แก้ว และ ตาหวาน 2 สมาชิกจากแก๊งชราไลน์แห่ง BNK48 กับเรื่องราวการไปเล่นดนตรีที่ญี่ปุ่นและชีวิตที่ทั้งคู่ไม่เคยเปิดเผยที่ไหนมาก่อน", description)
    }

    @Test
    fun titleGetSetTest() {
        val title = MusicData(null, null, null, null, null, "แก้วตาหวานใจ : Playlist เพลงโปรดของ แก้ว และ ตาหวาน BNK48", null)
        assertEquals("แก้วตาหวานใจ : Playlist เพลงโปรดของ แก้ว และ ตาหวาน BNK48", title)
    }

    @Test
    fun urlGetSetTest() {
        val url = MusicData(null, null, null, null, null, null, "https://www.fungjaizine.com/feature/my_ears/kaew-tawaan-bnk48")
        assertEquals("https://www.fungjaizine.com/feature/my_ears/kaew-tawaan-bnk48", url)
    }
}