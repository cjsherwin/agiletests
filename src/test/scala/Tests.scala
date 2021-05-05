import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Tests extends AnyFlatSpec with Matchers {

  "add" should "add numbers" in {
    TestApp.add(1, 3) shouldBe 4
  }
}
