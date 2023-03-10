package uz.gita.mindgameapp.ui.game

import uz.gita.mindgameapp.ui.game.GameContract
import uz.gita.mindgameapp.ui.game.GameModel

class GamePresenter(
    private val view: GameContract.View,
) : GameContract.Presenter {
    private val model: GameContract.Model = GameModel()

    override fun loadNextQuestion() {
        view.describeQuestionData(model.nextQuestionData())
    }

    override fun clickVariantButton(value: String) {
        view.showAnswer(value, view.getFirstEmptyPos())
    }
}


