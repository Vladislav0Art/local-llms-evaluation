package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal_Multiplereturns {

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
    public void appendKeyVal_Multiplereturns() {
        Connection.KeyVal kv1 = new Connection.KeyValImpl();
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Mockito.when(builder.appendKeyVal(kv1)).thenReturn(url);
        String builtUrl = builder.appendKeyVal(kv1).toString();
        System.out.println(builtUrl);
    }

}