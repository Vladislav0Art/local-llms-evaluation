package org.jsoup.helper;

import static org.jsoup.helper.HttpConnection.connect;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewRequestTest {

    @Test
    public void newRequestTest() throws IOException {
        Connection connection = Mockito.mock(Connection.class);
        Response response = new Response();
        Mockito.when(connection.execute()).thenReturn(response);
        Response result = connection.execute();
        assertNotNull(result);
    }

}