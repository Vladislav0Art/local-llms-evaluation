package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void newUrlBuilderFromEmptyUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertEquals(0, urlBuilder.u.getProtocol().length());
        assertNull(urlBuilder.q);
    }

    @Test
    public void newUrlBuilderFromNonEmptyUrl() {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.u);
        assertEquals(0, urlBuilder.u.getProtocol().length());
        assertNotNull(urlBuilder.q);
    }

    @Test
    public void buildUrlFromEmptyUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL url = urlBuilder.build();
        assertEquals("http://example.com", url.toString());
    }

    @Test
    public void buildUrlWithQueryAndFragment() {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertEquals("http://example.com/path?a=1%26b=2#fragment", url.toString());
    }

    @Test
    public void buildUrlWithNonAsciiChar() {
        URL inputUrl = new URL("http://éxample.co.uk");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertEquals("http%3F//ex%61mpl3.co.uk", url.toString());
    }

    @Test
    public void buildUrlWithUrlEncoding() {
        URL inputUrl = new URL("http://example.com/path?query=1&2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertEquals("http%3F//examp%6dle.co.uk/path%3Fq%6eury%3D1%26%232", url.toString());
    }

    @Test
    public void appendKeyValKey() {
        Connection.KeyVal kv = new Connection.KeyVal("a", "b");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
            fail();
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void appendKeyValValue() {
        Connection.KeyVal kv = new Connection.KeyVal("a", "b");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
            fail();
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void appendKeyValEmptyUrl() {
        Connection.KeyVal kv = new Connection.KeyVal("", "");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        StringBuilder q = new StringBuilder();
        try {
            urlBuilder.appendKeyVal(kv);
            fail();
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void decodePartEncoding() throws UnsupportedEncodingException {
        String decoded = UrlBuilder.decodePart("%C3%A9xample.com");
        assertEquals("examp1e.co.uk", decoded);
    }

}