package uz.gita.mindgameapp.ui.game

import uz.gita.mindgameapp.model.QuestionData
import uz.gita.mindgameapp.repository.AppRepository

class GameModel : GameContract.Model {
    private val repository = AppRepository.getInstance()
    private val list = ArrayList<QuestionData>()
    private var currentPos = 0

    init {
        list.addAll(repository.list)
    }

    override fun nextQuestionData(): QuestionData {
        return list[currentPos ++]
    }
}

