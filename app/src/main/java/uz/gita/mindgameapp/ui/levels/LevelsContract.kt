package uz.gita.mindgameapp.ui.levels

interface LevelsContract {

    interface View{
        fun openGameActivity(category: Int)
    }

    interface Presenter{
        fun clickCategoryButton(category: Int)
    }
}