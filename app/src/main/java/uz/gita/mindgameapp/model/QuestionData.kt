package uz.gita.mindgameapp.model

data class QuestionData(
    val category: String,
    val image1ResID: Int,
    val image2ResID: Int,
    val image3ResID: Int,
    val image4ResID: Int,
    val variant: String,  // 12
    val answer: String   // 3 -> 7
)
