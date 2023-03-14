package uz.gita.mindgameapp.ui.game


class GamePresenter(
    private val view: GameContract.View, category: Int
) : GameContract.Presenter {

    private var model: GameModel

    init {
        model = GameModel(category)
        loadNextQuestion()
    }

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
            view.describeQuestionData(model.nextQuestionData(), model.getCurrentPos(), model.getTotal())

        } else view.openResultActivity()
    }

    override fun clickVariantButton(value: String) {
        view.showAnswer(value, view.getFirstEmptyPos())
    }
}