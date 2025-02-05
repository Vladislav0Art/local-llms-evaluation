package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedGetExecuteWithHttpStatusExceptionTest {

    @Test
    public void getExecuteWithHttpStatusExceptionTest() throws IOException {
        String url = "http://nonexistentwebsite222222222.com";
        HttpConnection conn = (HttpConnection) HttpConnection.connect(url);
        conn.get();
    }

}