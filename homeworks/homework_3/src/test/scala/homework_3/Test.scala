package homework_3

import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        'test_example - {
            val trueStr = "правда"
            val falseStr = "ложь"
            val hundred = "100"
            val numDouble = "1000.01"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(100) == hundred)
            assert(Exercises.prettyBooleanFormatter1(1000.01) == numDouble)
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)

            assert(Exercises.max1(Seq()) == 0)
            assert(Exercises.max1(Seq(5, 50, 0,-10, 100, 5)) == 100)
            assert(Exercises.max2(Seq()) == Seq(0))
            assert(Exercises.max2(Seq(15, 5, 8, -10, 0, 500)) == Seq(500))
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(15, 5, 8, -10, 0, 500)).contains(500))

            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum2(5, 6) == 11)
            assert(Exercises.sum3(10, 20) == 30)
        }
    }
}
