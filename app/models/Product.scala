package models

// Model class
case class Product(ean : Long, name : String, description : String)

/**
  * Created by callumcooper on 10/02/2016.
  */
// Data access object
object Product {

  // Create a local array of products
  var products = Set(
    Product(5010255079763L, "Paperclips Large",
      "Large Plain Pack of 1000"),
    Product(5018206244666L, "Giant Paperclips",
    "Giant Plain 51mm 100 pack"),
    Product(5018306332812L, "Paperclip Giant Plain",
      "Giant Plain Pack of 10000"),
    Product(5018306312913L, "No Tear Paper Clip",
      "No Tear Extra Large Pack of 1000"),
    Product(5018206244611L, "Zebra Paperclips",
      "Zebra Length 28mm Assorted 150 Pack"))

  // find all products method
  def findAll = products.toList.sortBy(_.ean)
}
