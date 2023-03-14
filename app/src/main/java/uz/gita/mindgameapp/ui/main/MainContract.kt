package uz.gita.mindgameapp.ui.main

interface MainContract {

    interface View {
        fun openGameActivity(category: Int)
    }

    interface Presenter {
        fun randomCategory(): Int
        fun clickRandomButton()
    }
}