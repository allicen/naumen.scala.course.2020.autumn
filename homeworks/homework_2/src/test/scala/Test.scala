import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val vectorOne: Vector2D = Vector2D(10, 20)
    val vectorTwo: Vector2D = Vector2D(30, 40)
    val vectorThree: Vector2D = Vector2D(15, 40)
    val vectorFour: Vector2D = Vector2D(5, 105)

    val tests: Tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
    }

    val testSumOfDivBy3Or5: Tests = Tests{
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(5, 12) == 42)
            assert(Exercises.sumOfDivBy3Or5(10, 50) == 570)
        }
    }

    val testPrimeFactor: Tests = Tests{
        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == List(2, 5))
            assert(Exercises.primeFactor(98) == List(2, 7))
            assert(Exercises.primeFactor(34) == List(2, 17))
        }
    }

    val testSumScalars: Tests = Tests{
        'test_sumScalars - {
            assert(Exercises.sumScalars(vectorOne, vectorTwo, vectorThree, vectorFour) == 5375)
            assert(Exercises.sumScalars(vectorFour, vectorTwo, vectorThree, vectorOne) == 5300)
            assert(Exercises.sumScalars(vectorFour, vectorThree, vectorTwo, vectorOne) == 5375)
        }
    }

    val testSumCosines: Tests = Tests{
        'test_sumCosines - {
            assert(BigDecimal(Exercises.sumCosines(vectorOne, vectorTwo, vectorThree, vectorFour)).setScale(8, BigDecimal.RoundingMode.DOWN).toDouble == 1.93584053)
            assert(BigDecimal(Exercises.sumCosines(vectorFour, vectorTwo, vectorThree, vectorOne)).setScale(8, BigDecimal.RoundingMode.DOWN).toDouble == 1.82213905)
            assert(BigDecimal(Exercises.sumCosines(vectorFour, vectorThree, vectorTwo, vectorOne)).setScale(8, BigDecimal.RoundingMode.DOWN).toDouble == 1.93584053)
        }
    }

    val sortByHeavyweight: Tests = Tests{
        'test_sumScalars - {
            assert(Exercises.sortByHeavyweight(Map("Gold" -> (2,   19.32))) == Seq ("Gold"))
            assert(Exercises.sortByHeavyweight(Map("Gold" -> (2,   19.32), "Uranium" ->   (2,   19.04))) == Seq ("Gold", "Uranium"))
            assert(Exercises.sortByHeavyweight(Map("Gold" -> (2,   19.32), "Uranium" ->   (2,   19.04), "Platinum" ->  (1,   21.45))) == Seq ("Gold", "Uranium", "Platinum"))
        }
    }
}
