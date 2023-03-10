package uz.gita.mindgameapp.repository

import uz.gita.mindgameapp.model.QuestionData
import uz.gita.mindgameapp.R

class AppRepository private constructor() {
    companion object {
        private lateinit var instance: AppRepository  // ! null

        fun getInstance(): AppRepository {
            if (!(Companion::instance.isInitialized))
                instance = AppRepository()
            return instance
        }
    }

    val list = ArrayList<QuestionData>()

    init {
        loadData()
    }

    private fun loadData() {
        list.add(
            QuestionData(
                R.drawable.ananas, R.drawable.apple, R.drawable.pomegranate,
                R.drawable.banana, "AFFDPRUGIPIT", "FRUIT"
            )
        )

        list.add(
            QuestionData(
                R.drawable.ferrari_1, R.drawable.ferrari_2, R.drawable.ferrari_3,
                R.drawable.ferrari_4, "LERUFRJRAIOI", "FERRARI"
            )
        )
    }
}