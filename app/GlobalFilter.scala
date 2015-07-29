import scala.concurrent.Future

import play.api.mvc.Filter
import play.api.mvc.RequestHeader
import play.api.mvc.Result
import play.api.mvc.Results

class GlobalFilter extends Filter {

  private lazy val badReq = Results.BadRequest

  def apply(next: RequestHeader => Future[Result])(request: RequestHeader): Future[Result] = {

    if (false) {
      return Future.successful(badReq)
    } else {
      return next(request)
    }
  }
}