package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedMethodTest {

    @Mock
    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void methodTest() {
        Connection.Method method = Connection.Method.POST;
        Connection connection = httpConnection.method(method);
        assertNotNull(connection);
    }

}