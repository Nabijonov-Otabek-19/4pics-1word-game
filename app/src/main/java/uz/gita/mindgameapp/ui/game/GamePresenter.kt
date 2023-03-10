package uz.gita.mindgameapp.ui.game


class GamePresenter(
    private val view: GameContract.View,
) : GameContract.Presenter {
    private val model: GameContract.Model = GameModel()

    override fun checkAnswer(userAnswer: String) {
        if (model.checkAnswer(userAnswer))
            loadNextQuestion()
        else showInfo()
    }

    private fun showInfo() {
        view.showToast()
    }

    override fun loadNextQuestion() {
        if (model.isLastQuestion()) {
            view.describeQuestionData(model.nextQuestionData())

        } else view.openResultActivity()
    }

    override fun clickVariantButton(value: String) {
        view.showAnswer(value, view.getFirstEmptyPos())
    }
}