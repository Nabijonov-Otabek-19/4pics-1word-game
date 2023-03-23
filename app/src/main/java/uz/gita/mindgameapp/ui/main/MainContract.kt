package uz.gita.mindgameapp.ui.main

interface MainContract {

    interface View {
        fun openGameActivity()
    }

    interface Presenter {
        fun clickRandomButton()
    }
}