package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    public Connection connection = Mockito.mock(Connection.class);

    private UrlBuilder urlBuilder = new UrlBuilder(connection);

    @Test
    public void build_PunnyCodingHostWorks() {
        // given
        String host = "example.com";
        when(connection.getHost()).thenReturn(host);
        urlBuilder.u = new URL("http://example.com/path?query=abc#frag");

        // when
        urlBuilder.build();

        // then
        assertEquals("http://xn--3e0.ho", urlBuilder.u.getAuthority());
    }

    @Test
    public void build_PathEncodedWorks() {
        // given
        String path = "path with special chars!";
        urlBuilder.u = new URL("http://example.com/path?query=abc#frag");

        // when
        urlBuilder.build();

        // then
        assertEquals("%20f8b0b21c", urlBuilder.u.getPath());
    }

    @Test
    public void build_QueriesAndFragmentsWork() {
        // given
        String query = "key1=value1&key2=value2";
        String fragment = "#frag";
        urlBuilder.u = new URL("http://example.com/path");
        when(connection.getRef()).thenReturn(fragment);
        urlBuilder.q = Mockito.mock(StringBuilder.class);

        // when
        urlBuilder.build();

        // then
        assertEquals("?key1=value1&key2=value2#frag", urlBuilder.u.getQuery());
    }

    @Test
    public void build_ThrowsMalformedURLException() {
        // given
        urlBuilder.u = new URL("http://example.com/invalid");
        when(connection.getHost()).thenReturn(null);

        // when and then
        assertThrows(MalformedURLException.class, () -> urlBuilder.build());
    }

    @Test
    public void appendKeyValWorks() throws UnsupportedEncodingException {
        // given
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.q = Mockito.mock(StringBuilder.class);

        // when
        urlBuilder.appendKeyVal(kv);

        // then
        assertEquals("?key=value", urlBuilder.q.toString());
    }

    @Test
    public void appendKeyVal_ThrowsUnsupportedEncodingException() {
        // given
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.q = Mockito.mock(StringBuilder.class);
        when(connection.getQuery()).thenReturn(null);

        // when and then
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
    }

    @Test
    public void decodePartWorks() {
        // given
        String encoded = "example.com";
        when(connection.getHost()).thenReturn(encoded);

        // when
        String decoded = UrlBuilder.decodePart(encoded);

        // then
        assertEquals("example.com", decoded);
    }

    @Test
    public void appendToAsciiWorks() throws UnsupportedEncodingException {
        // given
        String s = " example ";
        StringBuilder sb = Mockito.mock(StringBuilder.class);
        UrlBuilder.appendToAscii(s, false, sb);

        // when
        String result = sb.toString();

        // then
        assertEquals("%20e2%80%9c%20%20", result);
    }

}