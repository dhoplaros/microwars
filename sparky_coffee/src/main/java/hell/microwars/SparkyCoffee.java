package hell.microwars;

import static spark.Spark.get;

public class SparkyCoffee {
    final static String STATUS_RESPONSE = "{\"status\":\"ok\"}";
    final static String NOT_CONNECTED_RESPONSE = "{\"status\":\"ok\"}";

    public static void main(final String[] args) {
        get("/status", (req, res) -> {
            res.type("application/json");
            return STATUS_RESPONSE;
        });
    }
}
