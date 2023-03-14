package uz.gita.mindgameapp.ui.levels

class LevelsPresenter(private val view: LevelsContract.View): LevelsContract.Presenter {


    override fun clickCategoryButton(category: Int) {
        view.openGameActivity(category)
    }
}