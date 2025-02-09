package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedIgnoreHttpErrorsTest {

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreHttpErrors(true);
        assertTrue(connection.request().ignoreHttpErrors());
    }

}