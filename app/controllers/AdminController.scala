package controllers

import javax.inject._

import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class AdminController @Inject()(val messagesApi: MessagesApi)(implicit executor: ExecutionContext)
  extends Controller with I18nSupport {

  def index = Action { implicit request =>
    Ok(views.html.crud_template.list())
  }

  def showCreate = Action { implicit request =>
    Ok(views.html.crud_template.create())
  }

  def showEdit = Action { implicit request =>
    Ok(views.html.crud_template.edit())
  }

  def showDetail = Action { implicit request =>
    Ok(views.html.crud_template.detail())
  }
}
