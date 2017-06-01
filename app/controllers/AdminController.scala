package controllers

import javax.inject._

import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class AdminController @Inject()(val messagesApi: MessagesApi)(implicit executor: ExecutionContext)
  extends Controller with I18nSupport {

  def index = Action { implicit request =>
    Ok(views.html.admin.crud_template.list())
  }

  def showCreate = Action { implicit request =>
    Ok(views.html.admin.crud_template.store())
  }

  def showEdit = Action { implicit request =>
    Ok(views.html.admin.crud_template.edit())
  }

  def showDetail = Action { implicit request =>
    Ok(views.html.admin.crud_template.detail())
  }
}
