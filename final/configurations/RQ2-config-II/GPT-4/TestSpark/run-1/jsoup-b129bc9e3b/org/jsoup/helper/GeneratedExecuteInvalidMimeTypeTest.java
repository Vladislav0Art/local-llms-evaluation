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

public class GeneratedExecuteInvalidMimeTypeTest {

    @Test
    public void executeInvalidMimeTypeTest() throws IOException {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("https://www.google.com/images/logos/google_logo_41.png");
        connection.execute();
    }

}