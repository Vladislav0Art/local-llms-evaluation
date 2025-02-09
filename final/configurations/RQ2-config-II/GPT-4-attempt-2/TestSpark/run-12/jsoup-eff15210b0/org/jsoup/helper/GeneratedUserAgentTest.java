package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.userAgent("Custom User Agent");
        assertNotNull("Updated Connection should not be null", updatedConnection);
    }

}