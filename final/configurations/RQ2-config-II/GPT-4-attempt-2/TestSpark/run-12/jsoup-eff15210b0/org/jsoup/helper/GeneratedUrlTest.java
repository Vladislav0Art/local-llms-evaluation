package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlTest {

    @Test
    public void urlTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.url("http://newtesturl.com");
        assertNotNull("Updated Connection should not be null", updatedConnection);
    }

}