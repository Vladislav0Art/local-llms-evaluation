package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestData {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testData() throws IOException, URISyntaxException {
        String body = "test_body";
        Connection.Response response = new HttpConnection().postDataCharset("UTF-8", "test_body");
        assertNotNull(response);
    }

}