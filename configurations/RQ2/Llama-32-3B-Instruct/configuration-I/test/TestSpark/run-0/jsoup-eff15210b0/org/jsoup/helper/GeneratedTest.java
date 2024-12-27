package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Request;
import org.junit.Before;
import org.mockito.Mockito;

public class GeneratedTest {

    public class Request {
        private String url;
        private Method method;

        public Request(String url, Method method) {
            this.url = url;
            this.method = method;
        }

        public String getUrl() {
            return url;
        }

        public Method getMethod() {
            return method;
        }
    }

    public interface Parser {
    }

    public class Document {
        private StringBuilder content;

        public Document() {
            content = new StringBuilder();
        }

        public void append(String text) {
            content.append(text);
        }

        public String getContent() {
            return content.toString();
        }
    }

    public class Response {
    }

    public class Method {
    }

    @Test
    public void urlStringTest() {
        String url = "http://example.com";
        Request request = new Request(url, Method.GET);
        HttpConnection connection = new HttpConnection(new Document(), request);
        assertThat(connection.urlString(), is(url));
    }

    @Test
    public void connectTimeoutIntTest() {
        int timeout = 500;
        Request request = new Request("http://example.com", Method.GET);
        HttpConnection connection = new HttpConnection(new Document(), request, timeout);
        assertThat(connection.timeoutValue(), is(timeout));
    }

    @Test
    public void executeDocumentTest() throws IOException {
        String url = "http://example.com";
        Request request = new Request(url, Method.GET);
        Response response = new Response();
        Document document = new Document();
        HttpConnection connection = new HttpConnection(document, request, response);
        assertThat(connection.execute(), is(document));
    }

}