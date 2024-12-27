package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectUrlWithFollowRedirectsTest {

    @Test
    public void connectUrlWithFollowRedirectsTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .followRedirects(true);
        assertNotNull(connection);
    }

}