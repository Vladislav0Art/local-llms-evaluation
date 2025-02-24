package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = Mockito.mock(HttpConnection.class);
    }

    @Test
    public void getMethodWithValidURL() throws IOException {
        Document doc = httpConnection.get();
        assertTrue(doc instanceof Document);
    }

    @Test
    public void postMethodWithValidURL() throws IOException {
        Document doc = httpConnection.post();
        assertTrue(doc instanceof Document);
    }

    @Test
    public void executeMethodWithInvalidURL() throws IOException {
        Connection.Response response = httpConnection.execute();
    }

    @Test
    public void requestMethodWithValidURL() {
        Connection.Request request = httpConnection.request();
        assertTrue(request instanceof Connection.Request);
    }

    @Test
    public void responseMethodWithValidURL() {
        Connection.Response response = httpConnection.response();
        assertTrue(response instanceof Connection.Response);
    }

    @Test
    public void postDataCharsetMethodWithValidURL() {
        HttpConnection httpConnection = new HttpConnection();
        String charset = "UTF-8";
        httpConnection.postDataCharset(charset);
        assertEquals(charset, httpConnection.request().data().getCharset().name());
    }

}