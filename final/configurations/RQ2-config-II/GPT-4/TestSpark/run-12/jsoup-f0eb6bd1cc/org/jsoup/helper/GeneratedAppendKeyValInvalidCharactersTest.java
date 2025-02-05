package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedAppendKeyValInvalidCharactersTest {

    @Test
    public void appendKeyValInvalidCharactersTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.test.com");
        UrlBuilder builder = new UrlBuilder(url);

        Connection.KeyVal kvMock = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kvMock.key()).thenReturn("ke:y");
        Mockito.when(kvMock.value()).thenReturn("va:lue");

        builder.appendKeyVal(kvMock);
    }

}