package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.jxc.http.HttpXJCClient;

public class GeneratedWhenResponseReturnsOkWithXmlThenResponseIsSuccessful {

    private Connection connection;

    @Mock
    private Request request;

    public void whenRequestReturnsOkThen() {
        when(request.get()).thenReturn(new Response(200, "Hello World", "text/plain"));
    }

    public void whenRequestReturnsBadRequestThen() {
        when(request.get()).thenReturn(new Response(400, "", ""));
    }

    public void whenResponseReturnsOkWithJsonThen() {
        when(response()).thenReturn(new Response(200, "{\"message\": \"Hello World\"}", "application/json"));
    }

    public void whenResponseReturnsOkWithXmlThen() {
        when(response()).thenReturn(new Response(200, "<message>Hello World</message>", "text/xml"));
    }

    public void whenResponseReturnsNotFoundThen() {
        when(response()).thenReturn(new Response(404, "", ""));
    }

    public void whenResponseReturnsInternalServerErrorThen() {
        when(response()).thenReturn(new Response(500, "", ""));
    }

    public HttpConnectionTest setup() throws MalformedURLException {
        connection = new HttpConnection();
        return this;
    }

    @Test
    public void whenResponseReturnsOkWithXmlThenResponseIsSuccessful() {
        when(connection.request(request)).thenAnswer(invocation -> invocation.getArguments()[0].get()).thenReturn(new Response(200, "<message>Hello World</message>", "text/xml"));
        HttpXJCClient client = new HttpXJCClient();
        assert connection.getResponse().getBodyAsString().equals("<message>Hello World</message>");
    }

}