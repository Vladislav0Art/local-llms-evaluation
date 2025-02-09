package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedReferrerTest {

    @Test
    public void referrerTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.referrer("http://refurl.com");
        assertNotNull("Updated connection should not be null", updatedConnection);
    }

}