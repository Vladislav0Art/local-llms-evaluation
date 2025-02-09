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

public class GeneratedMaxBodySizeTest {

    @Test
    public void maxBodySizeTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.maxBodySize(1024);
        Assert.assertEquals(1024, ((HttpConnection) connection).request().maxBodySize());
    }

}