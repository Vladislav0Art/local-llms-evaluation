package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRequestTest {

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertNotNull(httpConnection.request());
    }

}