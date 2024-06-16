import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    String ApiKey = "3622f2a8fb196d27add4847c";

    public Moneda buscaMoneda(String baseCode, String targetCode, double monto){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + ApiKey + "/pair/" + baseCode + "/" + targetCode + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No se a encontrado este tipo de divisa.");
        }
    }
}
