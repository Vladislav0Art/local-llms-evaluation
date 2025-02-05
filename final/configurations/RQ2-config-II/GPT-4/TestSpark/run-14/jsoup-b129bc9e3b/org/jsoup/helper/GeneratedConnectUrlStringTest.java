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
public class GeneratedConnectUrlStringTest {

    @Test
    public void connectUrlStringTest() {
        Connection connection = HttpConnection.connect("https://www.google.com");
        assertNotNull(connection);
    }

}