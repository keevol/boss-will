package com.keevol.bosswill

import javafx.application.Application
import javafx.geometry.{Pos, VPos}
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.effect.Reflection
import javafx.scene.layout.Pane
import javafx.scene.paint.Color
import javafx.scene.text.{Font, FontWeight, Text}
import javafx.stage.{Stage, StageStyle}


class BossWill extends Application {
  override def start(stage: Stage): Unit = {


    stage.setResizable(false)
    stage.setTitle("BossWill")
    stage.initStyle(StageStyle.UNIFIED)

    import javafx.scene.layout.AnchorPane
    val pane = new AnchorPane

    val wemePane = createContent()

    val label = new Label("©KEEVOL Consulting @ keevol.cn")
    label.setAlignment(Pos.CENTER)

    pane.getChildren.addAll(wemePane, label)
    AnchorPane.setLeftAnchor(label, 0)
    AnchorPane.setRightAnchor(label, 0)
    AnchorPane.setBottomAnchor(label, 10)

    val scene = new Scene(pane)
    scene.getStylesheets.addAll("/css/style.css")
    stage.setScene(scene)
    stage.setWidth(wemePane.getBoundsInLocal.getWidth + 20)
    stage.setHeight(wemePane.getBoundsInLocal.getHeight * 1.5)
    stage.show()

  }

  def createContent(): Pane = {
    val text = new Text("We");
    text.setLayoutX(30);
    text.setLayoutY(20);
    text.setTextOrigin(VPos.TOP);
    text.setFill(Color.RED)
    text.setFont(Font.font("Arial", FontWeight.BOLD, 211));

    val reflection = new Reflection();
    reflection.setTopOffset(0);
    reflection.setTopOpacity(0.75);
    reflection.setBottomOpacity(0.10);
    reflection.setFraction(0.7);

    text.setEffect(reflection);

    new Pane(text)
  }
}

object BossWill {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[BossWill], args: _*)
  }
}

object BossWillLauncher {
  def main(args: Array[String]): Unit = {
    BossWill.main(args)
  }
}
