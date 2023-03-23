package uz.gita.mindgameapp.ui.main

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    override fun clickRandomButton() {
        view.openGameActivity()
    }
}