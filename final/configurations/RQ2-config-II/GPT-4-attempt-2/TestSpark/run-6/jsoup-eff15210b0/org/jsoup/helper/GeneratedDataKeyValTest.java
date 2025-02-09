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

public class GeneratedDataKeyValTest {

    @Test
    public void dataKeyValTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.data("key1", "value1");
        Assert.assertEquals("value1", ((HttpConnection) connection).request().data().get(0).value());
    }

}