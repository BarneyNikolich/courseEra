package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
  import Main.pascal
  test("pascal: col=0,row=2") {
    assert(pascal(0,2) === 1)
  }

  test("pascal: col=0,row=1,2,3,4,5") {
    val rows = Array(1, 2, 3, 4, 5)
    for(row <- 0 to rows.length) {
      assert(pascal(0, row) === 1)
    }
  }

  test("pascal: col=3,row=3") {
      assert(pascal(3, 3) === 1)
  }

  test("pascal: col=1,row=2") {
    assert(pascal(1,2) === 2)
  }

  test("pascal: col=1,row=3") {
    assert(pascal(1,3) === 3)
  }
}
