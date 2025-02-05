package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValNonNullTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void appendKeyValNonNullTest() throws UnsupportedEncodingException {
        URL url = null;

        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        Connection.KeyVal keyval = Mockito.mock(Connection.KeyVal.class);
        when(keyval.key()).thenReturn("key");
        when(keyval.value()).thenReturn("value");

        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(keyval);

        URL result = urlBuilder.build();

        assertTrue(result.toString().contains("key=value"));
    }

}