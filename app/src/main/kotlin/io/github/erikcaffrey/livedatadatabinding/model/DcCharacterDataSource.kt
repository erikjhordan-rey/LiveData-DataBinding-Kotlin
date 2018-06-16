package io.github.erikcaffrey.livedatadatabinding.model

class DcCharacterDataSource {
    fun all(): List<DcCharacter> = listOf(
            DcCharacter("Green Arrow", "greenarrow_192x291_53c5882189d358.67363982"),
            DcCharacter("Green Lantern", "greenlantern_192x291_53c58825e12104.69475958"),
            DcCharacter("Batman", "batman_192x291_53c586e749eca9.23086395"),
            DcCharacter("Aquaman", "aquaman_192x291_53c58690b878f2.24442607"),
            DcCharacter("Flash", "flash_192x291_53c5884f9ef0f3.17717926"),
            DcCharacter("Captain Boomerang", "ThumbChar_192x291_CaptainBoomerang_57a2917937dd87.92908661"),
            DcCharacter("Harley Quinn", "harleyquinn_192x291_53c5882a58b405.75607533"),
            DcCharacter("Joker", "joker_192x291_53c58838088661.35975696"),
            DcCharacter("Captain Cold", "captaincold_192x291_53c5877b6d0b08.48501626")
    )
}