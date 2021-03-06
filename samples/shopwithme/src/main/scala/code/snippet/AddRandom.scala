package code
package snippet

import model._
import comet._
import lib._

import net.liftweb._
import http._
import util.Helpers._
import js._
import JsCmds._

object AddRandom {
  def render = "* *+" #> SHtml.ajaxButton("Add Random", () => {
    for {
      sess <- S.session
      ca <- sess.findComet("CometCart")
    } ca ! AddToCart(CartItem(Item.randomItem, 1))

    Noop
  })
}
