// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim.etc

import org.nlogo.agent.{ Observer, Turtle }
import org.nlogo.api.Syntax
import org.nlogo.nvm.{ Command, Context }

class _facexy extends Command {
  override def syntax =
    Syntax.commandSyntax(
      Array(Syntax.NumberType, Syntax.NumberType),
      "OT--", true)
  override def perform(context: Context) {
    context.agent match {
      case turtle: Turtle =>
        turtle.face(
          argEvalDoubleValue(context, 0),
          argEvalDoubleValue(context, 1),
          true)
      case observer: Observer =>
        observer.face(
          argEvalDoubleValue(context, 0),
          argEvalDoubleValue(context, 1))
    }
    context.ip = next
  }
}
