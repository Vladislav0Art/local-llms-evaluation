package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedExecuteHttpStatusExceptionTest {

    @Test
    public void executeHttpStatusExceptionTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection = (HttpConnection) connection.url("https://nonexistent.com");
        connection.execute();
    }

}