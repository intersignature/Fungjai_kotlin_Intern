package intern.kotlin.fungjai.sirichai.fungjaiintern.pojo

data class MusicData(var artist: String?, var cover: String?, var song: String?, var type: String?,
                     var description: String?, var title: String?, var url: String?) {
    constructor() : this("", "", "", "", "", "", "")
}

