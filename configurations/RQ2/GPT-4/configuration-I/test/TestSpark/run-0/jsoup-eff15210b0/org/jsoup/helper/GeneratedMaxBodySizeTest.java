package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedMaxBodySizeTest {

    @Test
    public void maxBodySizeTest() {
        Connection connection = new HttpConnection();
        assertNotNull(connection.timeout(2000));
    }

}