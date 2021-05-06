object TestApp extends App {

  case class Order(numPizzas: Int, price: Double)

  def order(numPizzas: Int,
            numStandardToppings: Int,
            numPremiumToppings: Int): Order = {
    val valueStandardToppings = numStandardToppings * 0.5
    val valuePremiumToppings = numPremiumToppings * 1.0
    val valuePizzas = numPizzas * 10
    Order(numPizzas, valuePizzas + valueStandardToppings + valuePremiumToppings)
  }
}
