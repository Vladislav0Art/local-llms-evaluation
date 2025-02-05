package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataTest {

    @Test
    public void dataTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.data("key", "value");
        assertTrue(connection.request().data().stream().anyMatch(keyval -> keyval.key().equals("key") && keyval.value().equals("value")));
    }

}