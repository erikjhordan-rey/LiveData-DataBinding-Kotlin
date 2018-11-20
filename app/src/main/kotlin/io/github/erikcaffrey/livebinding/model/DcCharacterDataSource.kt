package io.github.erikcaffrey.livebinding.model

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
            "${IMAGE_URL}greenarrow_192x291_53c5882189d358.67363982.jpg"
    )

    private fun greenLantern() = DcCharacter(
            "Green Lantern",
            "${IMAGE_URL}greenlantern_192x291_53c58825e12104.69475958.jpg"
    )

    private fun batman() = DcCharacter(
            "Batman",
            "${IMAGE_URL}batman_192x291_53c586e749eca9.23086395.jpg"
    )

    private fun aquaman() = DcCharacter(
            "Aquaman",
            "${IMAGE_URL}aquaman_192x291_53c58690b878f2.24442607.jpg"
    )

    private fun flash() = DcCharacter(
            "Flash",
            "${IMAGE_URL}flash_192x291_53c5884f9ef0f3.17717926.jpg"
    )

    private fun captainBoomerang() = DcCharacter(
            "Captain Boomerang",
            "${IMAGE_URL}ThumbChar_192x291_CaptainBoomerang_57a2917937dd87.92908661.jpg"
    )

    private fun superMan() = DcCharacter(
            "Super Man",
            "${IMAGE_URL}superman_192x291_53c5896880ca13.21900404.jpg"
    )

    private fun harleyQuinn() = DcCharacter(
            "Harley Quinn",
            "${IMAGE_URL}harleyquinn_192x291_53c5882a58b405.75607533.jpg"
    )

    private fun joker() = DcCharacter(
            "Joker",
            "${IMAGE_URL}joker_192x291_53c58838088661.35975696.jpg"
    )

    private fun captainCold() = DcCharacter(
            "Captain Cold",
            "${IMAGE_URL}captaincold_192x291_53c5877b6d0b08.48501626.jpg"
    )

    companion object {
        private const val IMAGE_URL = "https://www.dccomics.com/sites/default/files/styles/comics320x485/public/"
    }
}
