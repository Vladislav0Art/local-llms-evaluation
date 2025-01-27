package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection connection;

    @Test
    public void newUrlBuilder_fromNull_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void newUrlBuilder_fromValidUrl_returnNewInstance() {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assert builder != null;
    }

    @Test
    public void build_fromNull_ThrowsNullPointerException() {
        UrlBuilder builder = new UrlBuilder(null);
        assertThrows(NullPointerException.class, () -> builder.build());
    }

    @Test
    public void build_returnValidUrl() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        String expected = "http%3A//example.com";
        URI uri = new URI(builder.build());
        assertEquals(expected, uri.toString());
    }

    @Test
    public void appendKeyVal_fromValidConnection_keyAndValueAreEncodedCorrectly() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        String expected = "key=value";
        assertEquals(expected, StringUtil.toString(connection.getQuery()));
    }

    @Test
    public void appendKeyVal_fromNullConnection_throwsNullPointerException() {
        UrlBuilder builder = new UrlBuilder(null);
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new Connection.KeyVal("key", "value")));
    }

}