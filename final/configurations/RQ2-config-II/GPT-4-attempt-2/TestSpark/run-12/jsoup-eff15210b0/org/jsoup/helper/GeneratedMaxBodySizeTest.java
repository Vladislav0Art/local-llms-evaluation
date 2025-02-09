package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedMaxBodySizeTest {

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.maxBodySize(5000);
        assertNotNull("Updated connection should not be null", updatedConnection);
    }

}