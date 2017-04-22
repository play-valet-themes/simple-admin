package controllers

import javax.inject._

import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class AdminController @Inject()(val messagesApi: MessagesApi)(implicit executor: ExecutionContext)
  extends Controller with I18nSupport {

  def index = Action { implicit request =>
    Ok(views.html.admin.crud_template.list("Your new application is ready."))
  }

  def showCreate = Action { implicit request =>
    Ok(views.html.admin.crud_template.store("Your new application is ready."))
  }

  def showEdit = Action { implicit request =>
    Ok(views.html.admin.crud_template.edit("Your new application is ready."))
  }

  def showDetail = Action { implicit request =>
    Ok(views.html.admin.crud_template.detail("Your new application is ready."))
  }
}


