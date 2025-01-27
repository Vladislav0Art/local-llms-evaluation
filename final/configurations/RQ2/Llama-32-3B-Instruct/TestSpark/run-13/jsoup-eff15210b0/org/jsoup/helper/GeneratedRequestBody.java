package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedRequestBody {

    @Test
    public void requestBody() {
        String body = "body";
        Connection conn = HttpConnection.postDataCharset(body);
        assertNotNull(conn.request());
        assertEquals(body, conn.request().postData().getValue());
    }

}