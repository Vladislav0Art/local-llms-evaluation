package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTest {

    private String status_code;
    private String body;

    public Response(String status_code, String body) {
        this.status_code = status_code;
        this.body = body;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

public class TestResponse extends org.jsoup.Jsoup<Request> {
    @Override
    public Response parse(String html) {
        Document doc = Jsoup.parse(html);
        Request request = new Request(doc.select("title").first().text(), doc.text());
        return new Response(request.getStatus_code(), request.getBody());
    }

}