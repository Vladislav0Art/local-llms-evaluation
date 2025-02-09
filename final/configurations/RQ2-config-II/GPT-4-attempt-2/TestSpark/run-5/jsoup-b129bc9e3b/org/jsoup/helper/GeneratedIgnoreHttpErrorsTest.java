package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedIgnoreHttpErrorsTest {

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.ignoreHttpErrors(true);
        assertNotNull(connection);
    }

}