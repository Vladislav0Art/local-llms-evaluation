package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    private static final String RESPONSE_FORMAT = "{\"status_code\": \"%d\", \"data\": \"%s\"}";

    public static Response getData() {
        Document document = Jsoup.connect("https://example.com").get();
        return new Response(document.body().text());
    }

    public static int getStatusCode() {
        Document document = Jsoup.connect("https://example.com").get();
        return Integer.parseInt(document.selectFirst("span.status-code span").text().trim());
    }
}

class Request {

    private static final String RESPONSE_FORMAT = "{\"status_code\": \"%d\", \"data\": \"%s\"}";

    public static Response getData() {
        String data = JsoupHelper.getData();
        int statusCode = JsoupHelper.getStatusCode();
        return new Response(RESPONSE_FORMAT.format(statusCode, data));
    }

    public static String getMethod() {
        return Method.class.getSimpleName();
    }
}

class TestNG {

}