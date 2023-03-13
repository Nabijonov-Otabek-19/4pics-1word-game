package uz.gita.mindgameapp.repository

import uz.gita.mindgameapp.model.QuestionData
import uz.gita.mindgameapp.R

class AppRepository private constructor() {

     val list_animals: ArrayList<QuestionData> = ArrayList()
     val list_foods: ArrayList<QuestionData> = ArrayList()

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
        shuffleFoods()
        shuffleAnimals()
    }

    private fun shuffleFoods() {
        list_foods.add(QuestionData(
                R.drawable.cofe1, R.drawable.cofe2, R.drawable.cofe3,
                R.drawable.cofe4, "HFWEREFACLCO", "COFFEE"
            )
        )
        list_foods.add(QuestionData(
                R.drawable.cake1, R.drawable.cake2, R.drawable.cake3,
                R.drawable.cake4, "HHWEKOFAQLCD", "CAKE"
            )
        )
        list_foods.add(QuestionData(
                R.drawable.bread1, R.drawable.bread2, R.drawable.bread3,
                R.drawable.bread4, "BRAFGOQMNELD", "BREAD"
            )
        )
        list_foods.add(QuestionData(
                R.drawable.pizza1, R.drawable.pizza2, R.drawable.pizza3,
                R.drawable.pizza4, "ZZFGTERAPGQI", "PIZZA"
            )
        )
        list_foods.add(QuestionData(
                R.drawable.apple1, R.drawable.apple2, R.drawable.apple3,
                R.drawable.apple4, "LPTRIOPEAQWR", "APPLE"
            )
        )
        list_foods.add(QuestionData(
                R.drawable.fish1, R.drawable.fish2, R.drawable.fish3,
                R.drawable.fish4, "HQMRUTOAISFG", "FISH"
            )
        )
        list_foods.add(QuestionData(
            R.drawable.milk1, R.drawable.milk2, R.drawable.milk3,
            R.drawable.milk4, "KWERIGRMLTOW", "MILK"
        )
        )
        list_foods.add(QuestionData(
            R.drawable.cheese1, R.drawable.cheese2, R.drawable.cheese3,
            R.drawable.cheese4, "HECRUSCAIEFE", "CHEESE"
        )
        )
        list_foods.add(QuestionData(
            R.drawable.pasta1, R.drawable.pasta2, R.drawable.pasta3,
            R.drawable.pasta4, "TRSOWVCLAPAQ", "PASTA"
        )
        )
        list_foods.add(QuestionData(
            R.drawable.chicken1, R.drawable.chicken2, R.drawable.chicken3,
            R.drawable.chicken4, "KCOIEQACGLHN", "CHICKEN"
        )
        )
        list_foods.shuffle()
    }

    private fun shuffleAnimals() {
        //list_animals.add(QuestionData(R.drawable.))
    }
}