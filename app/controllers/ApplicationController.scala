package controllers

import play.api._
import play.api.mvc._

class ApplicationController extends Controller {

  def index = Action {

    // Redirect to products list URL
    Redirect(routes.ProductsController.list())
  }
}
