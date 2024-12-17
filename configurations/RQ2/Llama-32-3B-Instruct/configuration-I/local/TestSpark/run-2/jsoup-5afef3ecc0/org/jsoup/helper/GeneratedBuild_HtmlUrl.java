package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedBuild_HtmlUrl {

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
    public void build_HtmlUrl() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Mockito.when(builder.build()).thenReturn(url);
        String builtUrl = builder.build().toString();
        Mockito.verify(url).toExternalForm();
        System.out.println(builtUrl);
    }

}