package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedMaxBodySizeTest {

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        int bytes = 1024;
        Connection result = connection.maxBodySize(bytes);
        assertEquals(bytes, result.request().maxBodySize());
    }

}