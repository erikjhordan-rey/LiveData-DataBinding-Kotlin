package io.github.erikcaffrey.livedata_databinding.model

class DcCharacterDataSource {

    val all: List<DcCharacter>
        get() = listOf(greenArrow(),
                greenLantern(),
                batman(),
                aquaman(),
                flash(),
                captainBoomerang(),
                superMan(),
                harleyQuinn(),
                joker(),
                captainCold()
        )

    private fun greenArrow() = DcCharacter(
            "Green Arrow",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/greenarrow_192x291_53c5882189d358.67363982.jpg"
    )

    private fun greenLantern() = DcCharacter(
            "Green Lantern",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/greenlantern_192x291_53c58825e12104.69475958.jpg"
    )

    private fun batman() = DcCharacter(
            "Batman",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/batman_192x291_53c586e749eca9.23086395.jpg"
    )

    private fun aquaman() = DcCharacter(
            "Aquaman",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/aquaman_192x291_53c58690b878f2.24442607.jpg"
    )

    private fun flash() = DcCharacter(
            "Flash",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/flash_192x291_53c5884f9ef0f3.17717926.jpg"
    )

    private fun captainBoomerang() = DcCharacter(
            "Captain Boomerang",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/ThumbChar_192x291_CaptainBoomerang_57a2917937dd87.92908661.jpg"
    )

    private fun superMan() = DcCharacter(
            "Super Man",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/superman_192x291_53c5896880ca13.21900404.jpg"
    )

    private fun harleyQuinn() = DcCharacter(
            "Harley Quinn",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/harleyquinn_192x291_53c5882a58b405.75607533.jpg"
    )

    private fun joker() = DcCharacter(
            "Joker",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/joker_192x291_53c58838088661.35975696.jpg"
    )

    private fun captainCold() = DcCharacter(
            "Captain Cold",
            "http://www.dccomics.com/sites/default/files/styles/comics320x485/public/captaincold_192x291_53c5877b6d0b08.48501626.jpg"
    )
}
