
import android.os.AsyncTask
import android.view.View
import com.github.kittinunf.fuel.Fuel
import java.lang.Exception


class NetworkQuery : AsyncTask<String?, Void?, String?>() {
    override fun onPostExecute(feed: String?) {
        // TODO: check this.exception
        // TODO: do something with the feed
    }

    override fun doInBackground(vararg p0: String?): String? {
            val bodyJson = """
            {"authkey": "d79b4bc10a3f1fcda1645c5ab4f9ff41b4135d61",
            "userid": 1,
            "location":"[44.1,44.2]"}
        """
            val (request, response, result) = Fuel.post("http://34.125.208.240/location_update")
                .body(bodyJson)
                .response()
            println(request)
            println(response)
            println(result)
    return "Hello!"
    }
}