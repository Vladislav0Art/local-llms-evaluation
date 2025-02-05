package org.jsoup.helper;

import org.hamcrest.core.IsInstanceOf;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetUrlTest {

    @Test
    public void getUrlTest() throws MalformedURLException {
        Connection connection = new HttpConnection().url(new URL("https://www.google.com"));
        assertEquals(new URL("https://www.google.com"), connection.request().url());
    }

}