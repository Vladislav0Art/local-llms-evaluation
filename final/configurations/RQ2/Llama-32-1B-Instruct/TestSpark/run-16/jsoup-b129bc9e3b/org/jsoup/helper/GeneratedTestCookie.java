package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestCookie {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testCookie() throws IOException, URISyntaxException {
        String cookieName = "test_cookie";
        String value = "test_value";
        Connection.Response response = new HttpConnection().cookie(cookieName, value);
        assertNotNull(response);
    }

}