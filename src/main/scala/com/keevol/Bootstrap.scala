package com.keevol

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.shape.Rectangle
import javafx.stage.Stage

class BootstrapSampler extends Application {
  override def start(stage: Stage): Unit = {

    import javafx.scene.layout.StackPane
    import javafx.scene.paint.Color
    val pane = new StackPane

    // Create three squares
    val rectBottom = new Rectangle(250, 250)
    rectBottom.setFill(Color.AQUA)
    val rectMiddle = new Rectangle(200, 200)
    rectMiddle.setFill(Color.CADETBLUE)
    val rectUpper = new Rectangle(150, 150)
    rectUpper.setFill(Color.CORAL)

    // Place them on top of each other
    pane.getChildren.addAll(rectBottom, rectMiddle, rectUpper)

    stage.setScene(new Scene(pane))
    stage.setWidth(1024)
    stage.setHeight(768)
    stage.show()

  }
}

object BootstrapSampler {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[BootstrapSampler], args: _*)
  }
}

object BootstrapIDERunner{
  def main(args: Array[String]): Unit = {
    BootstrapSampler.main(args)
  }
}
