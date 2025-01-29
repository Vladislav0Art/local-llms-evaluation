package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testBuildUrl() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(mock(URL.class));
        when(urlBuilder.build()).thenReturn(new URISyntaxException(inputUrl, 0));
        String expectedOutput = "https://example.com/path?param1=value1&param2=value2";
        String actualOutput = urlBuilder.build();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testAppendKeyVal_Succeeds() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?param1=value1&param2=value2"));
        when(urlBuilder.appendKeyVal(mock(Connection.KeyVal.class))).thenReturn(true);
        String actualOutput = urlBuilder.appendKeyVal(new Connection.KeyVal("param1", "value1"));
        assertTrue(actualOutput.equals("param1=value1&param2=value2"));
    }

    @Test
    public void testAppendKeyVal_Fails() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?param1=value1&param2=value2"));
        when(urlBuilder.appendKeyVal(mock(Connection.KeyVal.class))).thenThrow(UnsupportedEncodingException.class);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new Connection.KeyVal("param1", "value1")));
    }

    @Test
    public void testAppendKeyVal_CausesException() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?param1=value1&param2=value2"));
        when(urlBuilder.appendKeyVal(mock(Connection.KeyVal.class))).thenThrow(UnsupportedEncodingException.class);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new Connection.KeyVal("", "")));
    }

    @Test
    public void testBuildUrl_NullUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        when(urlBuilder.build()).thenReturn(new URISyntaxException("https://example.com/path?param1=value1&param2=value2", 0));
        String expectedOutput = "https://example.com/path?param1=value1&param2=value2";
        String actualOutput = urlBuilder.build();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testAppendKeyVal_NullInput() {
        UrlBuilder urlBuilder = new UrlBuilder(mock(URL.class));
        when(urlBuilder.appendKeyVal(null)).thenReturn(true);
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(new Connection.KeyVal("param1", "value1")));
    }

    @Test
    public void testAppendKeyVal_NullConnection() {
        UrlBuilder urlBuilder = new UrlBuilder(mock(URL.class));
        when(urlBuilder.appendKeyVal(null)).thenReturn(true);
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(new Connection()));
    }

}