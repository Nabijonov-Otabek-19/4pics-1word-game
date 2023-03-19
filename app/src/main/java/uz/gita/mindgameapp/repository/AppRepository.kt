package uz.gita.mindgameapp.repository

import uz.gita.mindgameapp.model.QuestionData
import uz.gita.mindgameapp.R

class AppRepository private constructor() {

    val list_animals: ArrayList<QuestionData> = ArrayList()
    val list_foods: ArrayList<QuestionData> = ArrayList()
    val list_classroom: ArrayList<QuestionData> = ArrayList()
    val list_jobs: ArrayList<QuestionData> = ArrayList()

    companion object {
        private lateinit var instance: AppRepository  // ! null

        fun getInstance(): AppRepository {
            if (!(Companion::instance.isInitialized))
                instance = AppRepository()
            return instance
        }
    }

    init {
        loadData()
    }

    fun getNeedDataByCategory(count: Int): ArrayList<QuestionData> {
        return when (count) {
            1 -> list_animals
            2 -> list_foods
            3 -> list_classroom
            else -> list_jobs
        }
    }

    private fun loadData() {
        shuffleFoods()
        shuffleAnimals()
        shuffleClassroom()
        shuffleJobs()
    }

    private fun shuffleFoods() {
        list_foods.add(
            QuestionData(
                R.drawable.cofe1, R.drawable.cofe2, R.drawable.cofe3,
                R.drawable.cofe4, "HFWEREFACLCO", "COFFEE"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.cake1, R.drawable.cake2, R.drawable.cake3,
                R.drawable.cake4, "HHWEKOFAQLCD", "CAKE"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.bread1, R.drawable.bread2, R.drawable.bread3,
                R.drawable.bread4, "BRAFGOQMNELD", "BREAD"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.pizza1, R.drawable.pizza2, R.drawable.pizza3,
                R.drawable.pizza4, "ZZFGTERAPGQI", "PIZZA"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.apple1, R.drawable.apple2, R.drawable.apple3,
                R.drawable.apple4, "LPTRIOPEAQWR", "APPLE"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.fish1, R.drawable.fish2, R.drawable.fish3,
                R.drawable.fish4, "HQMRUTOAISFG", "FISH"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.milk1, R.drawable.milk2, R.drawable.milk3,
                R.drawable.milk4, "KWERIGRMLTOW", "MILK"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.cheese1, R.drawable.cheese2, R.drawable.cheese3,
                R.drawable.cheese4, "HECRUSCAIEFE", "CHEESE"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.pasta1, R.drawable.pasta2, R.drawable.pasta3,
                R.drawable.pasta4, "TRSOWVCLAPAQ", "PASTA"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.chicken1, R.drawable.chicken2, R.drawable.chicken3,
                R.drawable.chicken4, "KCOIEQACGLHN", "CHICKEN"
            )
        )
        list_foods.shuffle()
    }

    private fun shuffleAnimals() {
        list_animals.add(
            QuestionData(
                R.drawable.bear1, R.drawable.bear2, R.drawable.bear3,
                R.drawable.bear4, "FOAERFKBQWLJ", "BEAR"
            )
        )

        list_animals.add(
            QuestionData(
                R.drawable.snake1, R.drawable.snake2, R.drawable.snake3,
                R.drawable.snake4, "KEQOBSBJNLAE", "SNAKE"
            )
        )

        list_animals.add(
            QuestionData(
                R.drawable.shark1, R.drawable.shark2, R.drawable.shark3,
                R.drawable.shark4, "KEHOBSBRNLAE", "SHARK"
            )
        )

        list_animals.add(
            QuestionData(
                R.drawable.owl1, R.drawable.owl2, R.drawable.owl3,
                R.drawable.owl4, "KEHOBSWRNLAE", "OWL"
            )
        )

        list_animals.add(
            QuestionData(
                R.drawable.panda1, R.drawable.panda2, R.drawable.panda3,
                R.drawable.panda4, "POILANGJNWDA", "PANDA"
            )
        )

        list_animals.add(
            QuestionData(
                R.drawable.monkey1, R.drawable.monkey2, R.drawable.monkey3,
                R.drawable.monkey4, "KLMSWONRKEYQ", "MONKEY"
            )
        )

        list_animals.add(
            QuestionData(
                R.drawable.goose1, R.drawable.goose2, R.drawable.goose3,
                R.drawable.goose4, "IRTUESGOVQWO", "GOOSE"
            )
        )

        list_animals.add(
            QuestionData(
                R.drawable.camel1, R.drawable.camel2, R.drawable.camel3,
                R.drawable.camel4, "FIMAXEOLCFDT", "CAMEL"
            )
        )

        list_animals.add(
            QuestionData(
                R.drawable.rabbit1, R.drawable.rabbit2, R.drawable.rabbit3,
                R.drawable.rabbit4, "BIAOTLRBGHKJ", "RABBIT"
            )
        )

        list_animals.add(
            QuestionData(
                R.drawable.eagle1, R.drawable.eagle2, R.drawable.eagle3,
                R.drawable.eagle4, "QOEGTURLAEVB", "EAGLE"
            )
        )
    }

    private fun shuffleClassroom() {
        list_classroom.add(
            QuestionData(
                R.drawable.chair1, R.drawable.chair2, R.drawable.chair3,
                R.drawable.chair4, "GKAIROQGCKHH", "CHAIR"
            )
        )
        list_classroom.add(
            QuestionData(
                R.drawable.eraser1, R.drawable.eraser2, R.drawable.eraser3,
                R.drawable.eraser4, "EOWQERLAFJSR", "ERASER"
            )
        )
        list_classroom.add(
            QuestionData(
                R.drawable.pensil1, R.drawable.pensil2, R.drawable.pensil3,
                R.drawable.pensil4, "PGITOLENSGJT", "PENSIL"
            )
        )
        list_classroom.add(
            QuestionData(
                R.drawable.bag1, R.drawable.bag2, R.drawable.bag3,
                R.drawable.bag4, "PGITOAENBGJT", "BAG"
            )
        )
        list_classroom.add(
            QuestionData(
                R.drawable.desk1, R.drawable.desk2, R.drawable.desk3,
                R.drawable.desk4, "KGITDAENBGST", "DESK"
            )
        )
        list_classroom.add(
            QuestionData(
                R.drawable.glue1, R.drawable.glue2, R.drawable.glue3,
                R.drawable.glue4, "GUEOWLDFHAVB", "GLUE"
            )
        )
        list_classroom.add(
            QuestionData(
                R.drawable.book1, R.drawable.book2, R.drawable.book3,
                R.drawable.book4, "GTIOWKQBOFJA", "BOOK"
            )
        )
        list_classroom.add(
            QuestionData(
                R.drawable.board1, R.drawable.board2, R.drawable.board3,
                R.drawable.board4, "DRIOWKQBOFJA", "BOARD"
            )
        )
        list_classroom.add(
            QuestionData(
                R.drawable.marker1, R.drawable.marker2, R.drawable.marker3,
                R.drawable.marker4, "KROQRABEMGLA", "MARKER"
            )
        )
        list_classroom.add(
            QuestionData(
                R.drawable.ruler1, R.drawable.ruler2, R.drawable.ruler3,
                R.drawable.ruler4, "KREQRABUMGLA", "RULER"
            )
        )

        list_classroom.shuffle()
    }

    private fun shuffleJobs() {
        list_jobs.add(QuestionData(R.drawable.builder1, R.drawable.builder2, R.drawable.builder3,
        R.drawable.builder4, "TOIUEMBKQRDL", "BUILDER"))
    }
}
