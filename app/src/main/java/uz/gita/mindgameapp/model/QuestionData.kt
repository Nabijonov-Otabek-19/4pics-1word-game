package uz.gita.mindgameapp.model

data class QuestionData(
    val image1ResID: Int,
    val image2ResID: Int,
    val image3ResID: Int,
    val image4ResID: Int,
    val variant: String,  // 16
    val answer: String   // 8
)


