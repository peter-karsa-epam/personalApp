import javax.inject.Inject
import play.api.http.HttpFilters

class Filters @Inject() (
    glob: GlobalFilter) extends HttpFilters {
  val filters = Seq(glob)
}