package io.github.erikcaffrey.livedatadatabinding.model

class DcCharacter(val name: String, var imageProfileUrl: String) {
    init {
        imageProfileUrl = "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/" +
                "$imageProfileUrl.jpg"
    }
}