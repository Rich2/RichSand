/* Copyright 2024-6 Richard Oliver. Licensed under Apache Licence version 2.0. */
package pcore
import java.net.*, java.io.*, ostrat.*, javafx.*, stage.*, scene.*, layout.StackPane, control.Button, event.*

object MainFx
{
  def main(args: Array[String]): Unit =
  { javafx.application.Application.launch(classOf[AppStart], args*)
  }
}
class AppStart extends application.Application
{
  override def start(stage0: Stage): Unit =
  { println("RichSand starting.")
    stage0.setTitle("Rich Sand")
    val root = new StackPane
    val butt = new Button()
    butt.setText("Say Hello Sandbox")
    butt.setOnAction(new EventHandler[ActionEvent] {
      @Override def handle(event: ActionEvent) = System.out.println("Hello Sandbox!")
    })
    root.getChildren().add(butt)
    stage0.setScene(new Scene(root, 400, 280))
    stage0.show
  }
}