package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Mock
    private URL url;

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        when(url.getQuery()).thenReturn("query=value");

        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);

        assertEquals("query=value&key=value", urlBuilder.q.toString());
    }

}