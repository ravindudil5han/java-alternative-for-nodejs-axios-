import org.apache.http.HttpResponse;

import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.CloseableHttpClient;

import org.apache.http.impl.client.HttpClients;

import org.apache.http.util.EntityUtils;

import java.io.IOException;

import java.util.HashMap;

import java.util.Map;

public class HttpClientExample {

    public static void main(String[] args) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/posts");

        request.addHeader("content-type", "application/json");

        HttpResponse response = httpClient.execute(request);

        System.out.println(EntityUtils.toString(response.getEntity()));

        httpClient.close();

    }

}

