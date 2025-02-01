package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithUnicodeCharactersTest {


    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void appendKeyValWithUnicodeCharactersTest() throws Exception {
        when(keyVal.key()).thenReturn("ключ");
        when(keyVal.value()).thenReturn("значение");

        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(keyVal);

        URL expectedURL = new URL("http://example.com?%D0%BA%D0%BB%D1%8E%D1%87=%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D0%B5");
        assertEquals(expectedURL, urlBuilder.build());
    }

}