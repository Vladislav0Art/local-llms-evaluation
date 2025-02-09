package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFollowRedirectsTest {

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.followRedirects(true);
        assertNotNull("Updated connection should not be null", updatedConnection);
    }

}