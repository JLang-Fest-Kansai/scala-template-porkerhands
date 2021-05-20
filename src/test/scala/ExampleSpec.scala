import org.scalatest.freespec.AnyFreeSpec

class ExampleSpec extends AnyFreeSpec {
  "Poker Hands" - {
    "input 1" in {
      val output: String = PorkerHands.exec("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH")
      assert(output == "White wins - high card: Ace")
    }
    "input 2" in {
      val output: String = PorkerHands.exec("Black: 2H 4S 4C 2D 4H White: 2S 8S AS QS 3S")
      assert(output == "Black wins - full house")
    }
    "input 3" in {
      val output: String = PorkerHands.exec("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C KH")
      assert(output == "Black wins - high card: 9")
    }
    "input 4" in {
      val output: String = PorkerHands.exec("Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH")
      assert(output == "Tie")
    }
  }
}