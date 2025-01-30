package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void build_NormalURLTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputURL = urlBuilder.build();
        assertNotNull(outputURL);
        assertEquals("http://google.com", outputURL.toString());
    }

    @Test
    public void build_UrlWithQueryTest() throws Exception {
        URL inputUrl = new URL("http://google.com?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputURL = urlBuilder.build();
        assertNotNull(outputURL);
        assertEquals("http://google.com?query=value", outputURL.toString());
    }

    @Test
    public void build_UrlWithReferenceTest() throws Exception {
        URL inputUrl = new URL("http://google.com#reference");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputURL = urlBuilder.build();
        assertNotNull(outputURL);
        assertEquals("http://google.com#reference", outputURL.toString());
    }

    @Test
    public void appendKeyVal_EmptyKeyValTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);

        Mockito.when(keyVal.key()).thenReturn("");
        Mockito.when(keyVal.value()).thenReturn("");

        urlBuilder.appendKeyVal(keyVal);
        URL outputURL = urlBuilder.build();

        assertNotNull(outputURL);
        assertEquals("http://google.com", outputURL.toString());
    }

    @Test
    public void appendKeyVal_KeyValTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);

        Mockito.when(keyVal.key()).thenReturn("key");
        Mockito.when(keyVal.value()).thenReturn("val");

        urlBuilder.appendKeyVal(keyVal);
        URL outputURL = urlBuilder.build();

        assertNotNull(outputURL);
        assertEquals("http://google.com?key=val", outputURL.toString());
    }

    @Test
    public void appendKeyVal_MultipleKeyValTest() throws Exception {
        URL inputUrl = new URL("http://google.com?key=val");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);

        Mockito.when(keyVal.key()).thenReturn("key2");
        Mockito.when(keyVal.value()).thenReturn("val2");

        urlBuilder.appendKeyVal(keyVal);
        URL outputURL = urlBuilder.build();

        assertNotNull(outputURL);
        assertEquals("http://google.com?key=val&key2=val2", outputURL.toString());
    }

    @Test
    public void UrlBuilder_NonAsciiURLTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com/ñ");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputURL = urlBuilder.build();

        assertNotNull(outputURL);
        assertNotEquals(outputURL.toString(), inputUrl.toString());
    }

}