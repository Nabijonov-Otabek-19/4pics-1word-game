package uz.gita.mindgameapp.ui.game

import uz.gita.mindgameapp.model.QuestionData
import uz.gita.mindgameapp.repository.AppRepository

class GameModel : GameContract.Model {
    private val repository = AppRepository.getInstance()
    private val list = ArrayList<QuestionData>()
    private var currentPos = 0
    private val MAX_COUNT = 40

    init {
        list.addAll(repository.getNeedDataByCategory())
    }

    override fun getCurrentPos() = currentPos

    override fun getTotal() = MAX_COUNT

    override fun nextQuestionData() = list[currentPos++]

    override fun isLastQuestion(): Boolean {
        return currentPos < MAX_COUNT
    }

    override fun checkAnswer(userAnswer: String): Boolean {
        return userAnswer == list[currentPos - 1].answer
    }
}