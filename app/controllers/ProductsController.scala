package controllers

import play.api.mvc.{Action, Controller}
import models.Product

/**
  * Created by callumcooper on 10/02/2016.
  */
class ProductsController extends Controller {

  def list() = Action { implicit request =>

    // Create a products array
    val products = Product.findAll

    // Return action html page
    Ok(views.html.products.productList(products))
  }
}
