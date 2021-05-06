import org.scalatest.GivenWhenThen
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Tests extends AnyFlatSpec with GivenWhenThen with Matchers {

  "order" should "return an order with 3 pizzas" in {
    TestApp.order(3, 0, 0).numPizzas shouldBe 3
  }

  "ordering" should "return an order of value £30" in {
    Given("A margherita pizza costs £10")

    When("I order 3 pizzas")
    val order = TestApp.order(3, 0, 0)

    Then("The order price should be £30")
    order.price shouldBe 30
  }

  "ordering" should "return an order of value £32.00 with standard toppings" in {
    Given("A margherita pizza costs £10")
    And("A standard topping costs £0.50")

    When("I order 3 pizzas and 4 standard toppings")
    val order = TestApp.order(3, 4, 0)

    Then("The order price should be correct")
    order.price shouldBe 32.0
  }

  "ordering" should "return an order of value £46.00 with all toppings" in {
    Given("A margherita pizza costs £10")
    And("A standard topping costs £0.50")
    And("A premium topping costs £1.00")

    When("I order 4 pizzas with 2 standard toppings and 5 premium toppings")
    val order = TestApp.order(4, 2, 5)

    Then("The order price should be correct")
    order.price shouldBe 46.0
  }

  /*
  5. Order value and manual discount:
Given the full menu is available
When I order 2 pizzas with 4 standard toppings and a 5% manual discount
Then the order value is £20.90
   */

}
