package uz.gita.mindgameapp.ui.game

import uz.gita.mindgameapp.model.QuestionData

interface GameContract {
    interface Model {
        fun getCurrentPos(): Int
        fun getTotal(): Int
        fun nextQuestionData(): QuestionData
        fun isLastQuestion(): Boolean
        fun checkAnswer(userAnswer: String): Boolean
    }

    interface View {
        fun showToast()
        fun describeQuestionData(data: QuestionData, currentPos: Int, total: Int)
        fun showAnswer(value: String, index: Int)
        fun getFirstEmptyPos(): Int
        fun openResultActivity()
    }

    interface Presenter {
        fun checkAnswer(userAnswer: String)
        fun loadNextQuestion()
        fun clickVariantButton(value: String)
    }
}