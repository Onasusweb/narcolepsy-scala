import co.orderly.apiclient._

object Test {

  def main(args: Array[String]) {
    val api = new OrderlyApiClient("jdbc:postgresql://localhost:5432/ord_erp_dev", "postgres", "postgres")
    api.getPlatformInstanceParameters(1)
  }
}