/*
 * Created by Rebeco <rebeco@gmail.com>
 */

package org.rebeco.Dice

/** A class that represents a generic die.
 *
 *  @constructor create a new generic die.
 */
class Die {
  // Initialize the Random object
  val r = new scala.util.Random

  /** Method to throw the die with the options passed as parameter.
   *
   *  @param odds List of possible results for the die.
   *  @return The random result
   */
  def throwTheDie[T](odds: List[T]): T = {
    // Change the seed for the random choice with the current time
    r.setSeed(System.currentTimeMillis)
    odds(r.nextInt(odds.size))
  }
}

/** Factory for [[Die]] instances. */
object Die extends Die{

  /** Creates a D10 die. */
  def d10(): Int = Die.throwTheDie((1 to 10).toList)

  /** Creates a D6 die. */
  def d6(): Int = Die.throwTheDie((1 to 6).toList)

  /** Creates a D4 die. */
  def d4(): Int = Die.throwTheDie((1 to 4).toList)

  /** Creates a Dead of Winter die in spanish. */
  def deadOfWinterSP(): String = Die.throwTheDie(List("Sin efecto",
                                                    "Sin efecto",
                                                    "Sin efecto",
                                                    "Sin efecto",
                                                    "Sin efecto",
                                                    "Sin efecto",
                                                    "Daño normal",
                                                    "Daño normal",
                                                    "Daño normal",
                                                    "Daño helado",
                                                    "Daño helado",
                                                    "Mordedura"))
}
