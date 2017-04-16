package controllers

import javax.inject._

import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class AdminController @Inject()(
                                 val messagesApi: MessagesApi)(implicit executor: ExecutionContext)
  extends Controller with I18nSupport {

  def index = Action { implicit request =>
    Ok(views.html.admin.blank("Your new application is ready."))
  }

}
