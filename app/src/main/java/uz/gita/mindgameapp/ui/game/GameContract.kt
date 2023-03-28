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
        fun wrongAnsAnimation()
        fun showHint()
        fun setCoin()
        fun closeScreen()
        fun showToast()
        fun describeQuestionData(data: QuestionData, currentPos: Int, total: Int)
        fun showAnswer(value: String, index: Int)
        fun getFirstEmptyPos(): Int
        fun openResultActivity()
    }

    interface Presenter {
        fun hint(coin: Int)
        fun getCoin(): Int
        fun addCoin(coin: Int)
        fun divideCoin(coin: Int)
        fun showExitDialog()
        fun showWinDialog()
        fun checkAnswer(userAnswer: String)
        fun loadNextQuestion()
        fun clickVariantButton(value: String)
    }
}