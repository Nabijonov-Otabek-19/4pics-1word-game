package uz.gita.mindgameapp.ui.main

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {


    override fun randomCategory(): Int {
        return (1..2).random()
    }

    override fun clickRandomButton() {
        view.openGameActivity(randomCategory())
    }
}