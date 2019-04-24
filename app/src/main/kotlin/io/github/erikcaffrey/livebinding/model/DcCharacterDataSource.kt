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
            "${IMAGE_URL}Char_Profile_GreenArrow_5c4915494b4039.94050514.jpg"
    )

    private fun greenLantern() = DcCharacter(
            "Green Lantern",
            "${IMAGE_URL}Char_Profile_GreenLantern_20190116_5c3fc8c14ceda8.50076512.jpg"
    )

    private fun batman() = DcCharacter(
            "Batman",
            "${IMAGE_URL}Char_Profile_Batman_20190116_5c3fc4b40faec2.47318964.jpg"
    )

    private fun aquaman() = DcCharacter(
            "Aquaman",
            "${IMAGE_URL}Char_Profile_Aquaman_5c411a95e71072.35445903.jpg"
    )

    private fun flash() = DcCharacter(
            "Flash",
            "${IMAGE_URL}Char_Profile_Flash_20190116_5c3fcaaa18f0e8.03668117.jpg"
    )

    private fun captainBoomerang() = DcCharacter(
            "Captain Boomerang",
            "${IMAGE_URL}Char_Profile_CaptainBoomerang_5c47c7697e4c81.97961521.jpg"
    )

    private fun superMan() = DcCharacter(
            "Bizarro",
            "${IMAGE_URL}Char_Profile_Bizarro_5c4114e7bebcd5.79694855.jpg"
    )

    private fun harleyQuinn() = DcCharacter(
            "Harley Quinn",
            "${IMAGE_URL}Char_Profile_HarleyQuinn_5c4a3e75812334.21707976.jpg"
    )

    private fun joker() = DcCharacter(
            "Joker",
            "${IMAGE_URL}Char_Profile_Joker_5c4a42b7ef2091.76638294.jpg"
    )

    private fun captainCold() = DcCharacter(
            "Captain Cold",
            "${IMAGE_URL}Char_Profile_CaptainCold_5c47c824a31862.57032666.jpg"
    )

    companion object {
        private const val IMAGE_URL = "https://www.dccomics.com/sites/default/files/styles/character_thumb_160x160/public/"
    }
}
