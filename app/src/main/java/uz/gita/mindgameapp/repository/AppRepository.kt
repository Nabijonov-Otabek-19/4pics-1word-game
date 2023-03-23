package uz.gita.mindgameapp.repository

import uz.gita.mindgameapp.model.QuestionData
import uz.gita.mindgameapp.R

class AppRepository private constructor() {

    private val list_question: ArrayList<QuestionData> = ArrayList()

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

    fun getNeedDataByCategory(): ArrayList<QuestionData> {
        return list_question
    }

    private fun loadData() {
        shuffleQuestions()
        shuffleJobs()
        shuffleClassroom()
        shuffleAnimals()
        list_question.shuffle()
    }

    private fun shuffleQuestions() {
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.cofe1, R.drawable.cofe2, R.drawable.cofe3,
                R.drawable.cofe4, "HFWEREFACLCO", "COFFEE"
            )
        )
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.cake1, R.drawable.cake2, R.drawable.cake3,
                R.drawable.cake4, "HHWEKOFAQLCD", "CAKE"
            )
        )
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.bread1, R.drawable.bread2, R.drawable.bread3,
                R.drawable.bread4, "BRAFGOQMNELD", "BREAD"
            )
        )
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.pizza1, R.drawable.pizza2, R.drawable.pizza3,
                R.drawable.pizza4, "ZZFGTERAPGQI", "PIZZA"
            )
        )
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.apple1, R.drawable.apple2, R.drawable.apple3,
                R.drawable.apple4, "LPTRIOPEAQWR", "APPLE"
            )
        )
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.fish1, R.drawable.fish2, R.drawable.fish3,
                R.drawable.fish4, "HQMRUTOAISFG", "FISH"
            )
        )
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.milk1, R.drawable.milk2, R.drawable.milk3,
                R.drawable.milk4, "KWERIGRMLTOW", "MILK"
            )
        )
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.cheese1, R.drawable.cheese2, R.drawable.cheese3,
                R.drawable.cheese4, "HECRUSCAIEFE", "CHEESE"
            )
        )
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.pasta1, R.drawable.pasta2, R.drawable.pasta3,
                R.drawable.pasta4, "TRSOWVCLAPAQ", "PASTA"
            )
        )
        list_question.add(
            QuestionData(
                "Food",
                R.drawable.chicken1, R.drawable.chicken2, R.drawable.chicken3,
                R.drawable.chicken4, "KCOIEQACGLHN", "CHICKEN"
            )
        )
    }

    private fun shuffleAnimals() {
        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.bear1, R.drawable.bear2, R.drawable.bear3,
                R.drawable.bear4, "FOAERFKBQWLJ", "BEAR"
            )
        )

        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.snake1, R.drawable.snake2, R.drawable.snake3,
                R.drawable.snake4, "KEQOBSBJNLAE", "SNAKE"
            )
        )

        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.shark1, R.drawable.shark2, R.drawable.shark3,
                R.drawable.shark4, "KEHOBSBRNLAE", "SHARK"
            )
        )

        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.owl1, R.drawable.owl2, R.drawable.owl3,
                R.drawable.owl4, "KEHOBSWRNLAE", "OWL"
            )
        )

        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.panda1, R.drawable.panda2, R.drawable.panda3,
                R.drawable.panda4, "POILANGJNWDA", "PANDA"
            )
        )

        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.monkey1, R.drawable.monkey2, R.drawable.monkey3,
                R.drawable.monkey4, "KLMSWONRKEYQ", "MONKEY"
            )
        )

        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.goose1, R.drawable.goose2, R.drawable.goose3,
                R.drawable.goose4, "IRTUESGOVQWO", "GOOSE"
            )
        )

        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.camel1, R.drawable.camel2, R.drawable.camel3,
                R.drawable.camel4, "FIMAXEOLCFDT", "CAMEL"
            )
        )

        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.rabbit1, R.drawable.rabbit2, R.drawable.rabbit3,
                R.drawable.rabbit4, "BIAOTLRBGHKJ", "RABBIT"
            )
        )

        list_question.add(
            QuestionData(
                "Animal",
                R.drawable.eagle1, R.drawable.eagle2, R.drawable.eagle3,
                R.drawable.eagle4, "QOEGTURLAEVB", "EAGLE"
            )
        )
    }

    private fun shuffleClassroom() {
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.chair1, R.drawable.chair2, R.drawable.chair3,
                R.drawable.chair4, "GKAIROQGCKHH", "CHAIR"
            )
        )
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.eraser1, R.drawable.eraser2, R.drawable.eraser3,
                R.drawable.eraser4, "EOWQERLAFJSR", "ERASER"
            )
        )
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.pensil1, R.drawable.pensil2, R.drawable.pensil3,
                R.drawable.pensil4, "PGITOLENSGJT", "PENSIL"
            )
        )
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.bag1, R.drawable.bag2, R.drawable.bag3,
                R.drawable.bag4, "PGITOAENBGJT", "BAG"
            )
        )
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.desk1, R.drawable.desk2, R.drawable.desk3,
                R.drawable.desk4, "KGITDAENBGST", "DESK"
            )
        )
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.glue1, R.drawable.glue2, R.drawable.glue3,
                R.drawable.glue4, "GUEOWLDFHAVB", "GLUE"
            )
        )
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.book1, R.drawable.book2, R.drawable.book3,
                R.drawable.book4, "GTIOWKQBOFJA", "BOOK"
            )
        )
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.board1, R.drawable.board2, R.drawable.board3,
                R.drawable.board4, "DRIOWKQBOFJA", "BOARD"
            )
        )
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.marker1, R.drawable.marker2, R.drawable.marker3,
                R.drawable.marker4, "KROQRABEMGLA", "MARKER"
            )
        )
        list_question.add(
            QuestionData(
                "Classroom",
                R.drawable.ruler1, R.drawable.ruler2, R.drawable.ruler3,
                R.drawable.ruler4, "KREQRABUMGLA", "RULER"
            )
        )
    }

    private fun shuffleJobs() {
        list_question.add(
            QuestionData("Job",
                R.drawable.builder1, R.drawable.builder2, R.drawable.builder3,
                R.drawable.builder4, "TOIUEMBKQRDL", "BUILDER"
            )
        )

        list_question.add(
            QuestionData("Job",
                R.drawable.butcher1, R.drawable.butcher2, R.drawable.butcher3,
                R.drawable.butcher4, "OUTWELRCHBAK", "BUTCHER"
            )
        )

        list_question.add(
            QuestionData("Job",
                R.drawable.teacher1, R.drawable.teacher2, R.drawable.teacher3,
                R.drawable.teacher4, "TOECHLWQAKRE", "TEACHER"
            )
        )

        list_question.add(
            QuestionData("Job",
                R.drawable.artist1, R.drawable.artist2, R.drawable.artist3,
                R.drawable.artist4, "TOJTVIRKSAMZ", "ARTIST"
            )
        )

        list_question.add(
            QuestionData("Job",
                R.drawable.miner1, R.drawable.miner2, R.drawable.miner3,
                R.drawable.miner4, "ORMEIQADNGJD", "MINER"
            )
        )

        list_question.add(
            QuestionData("Job",
                R.drawable.doctor1, R.drawable.doctor2, R.drawable.doctor3,
                R.drawable.doctor4, "OKCTRLQDDOCG", "DOCTOR"
            )
        )

        list_question.add(
            QuestionData("Job",
                R.drawable.pilot1, R.drawable.pilot2, R.drawable.pilot3,
                R.drawable.pilot4, "OTKVLMAIEPSD", "PILOT"
            )
        )

        list_question.add(
            QuestionData("Job",
                R.drawable.farmer1, R.drawable.farmer2, R.drawable.farmer3,
                R.drawable.farmer4, "FOREMQASJDKR", "FARMER"
            )
        )

        list_question.add(
            QuestionData("Job",
                R.drawable.actor1, R.drawable.actor2, R.drawable.actor3,
                R.drawable.actor4, "ORTVKDACFHEW", "ACTOR"
            )
        )

        list_question.add(
            QuestionData("Job",
                R.drawable.barber1, R.drawable.barber2, R.drawable.barber3,
                R.drawable.barber4, "OERMBABKRQLF", "BARBER"
            )
        )
    }
}
