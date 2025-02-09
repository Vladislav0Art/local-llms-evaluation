package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.Header;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws Exception {
        ClientAndServer mockServer = ClientAndServer.startClientAndServer();
        mockServer.when(
                request().withMethod("GET").withPath("/"),
                Times.exactly(1)
        ).respond(response().withStatusCode(200).withHeaders(
                new Header("Content-Type", "text/html;charset=utf-8"),
                new Header("Date", "Tue, 06 Apr 2021 11:43:36 GMT"))
        );
        Connection.Response response = HttpConnection.connect(new URL("http://localhost:" + mockServer.getLocalPort()))
                .method(Connection.Method.GET)
                .execute();
        Assert.assertEquals(200, response.statusCode());
        mockServer.stop();
    }

}