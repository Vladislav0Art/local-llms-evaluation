package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Mock
    private URL url;

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        when(url.getQuery()).thenReturn("key=value");

        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));

        assertEquals("key=value&key2=value2", urlBuilder.q.toString());
    }

}