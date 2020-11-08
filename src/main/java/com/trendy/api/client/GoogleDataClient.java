package com.trendy.api.client;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GoogleDataClient {

    public String getHourlyData() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Request request = new Request.Builder()
                .url("https://trends.google.com/trends/hottrends/atom/hourly")
                .method("GET", null)
                .addHeader("Requester-ID", "Meow")
                .build();
        Call call = client.newCall(request);

        // TODO: Parse response body
        Response response = call.execute();
        return response.body().string();
    }
}
