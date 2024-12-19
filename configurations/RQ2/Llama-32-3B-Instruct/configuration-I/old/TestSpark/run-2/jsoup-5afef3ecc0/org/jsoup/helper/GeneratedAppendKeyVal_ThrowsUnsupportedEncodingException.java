package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal_ThrowsUnsupportedEncodingException {

    @Mock
    private Connection connection;

    public static class UrlBuilder {
        public UrlBuilder(URL inputUrl) { /* implementation */ }

        public URL build() { /* implementation */ }

        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException { /* implementation */ }
    }

    public static class Connection {
        public interface KeyVal {
        }

        public static class KeyValImpl implements KeyVal {
        }
    }

    @Test
    public void appendKeyVal_ThrowsUnsupportedEncodingException() {
        Connection.KeyVal kv = new Connection.KeyValImpl();
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(kv));
    }

}