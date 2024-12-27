package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

import org.mockito.Mock;

public class GeneratedUrl_StringTest {

    @Test
    public void url_StringTest() {
        Connection connection = new HttpConnection();
        Connection connection1 = connection.url("https://www.example.com");
        assertNotNull(connection1);
    }

}