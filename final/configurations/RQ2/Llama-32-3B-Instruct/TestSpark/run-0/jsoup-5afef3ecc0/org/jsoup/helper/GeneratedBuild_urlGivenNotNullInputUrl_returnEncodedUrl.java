package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuild_urlGivenNotNullInputUrl_returnEncodedUrl {

    public static class Connection {
        public interface KeyVal {
            String getKey();

            String getValue();
        }

        public static class DefaultKeyVal implements KeyVal {
            private final String key;
            private final String value;

            public DefaultKeyVal(String key, String value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public String getKey() {
                return key;
            }

            @Override
            public String getValue() {
                return value;
            }
        }
    }

    public static class DataUtil {
        public static final String UTF_8 = "UTF-8";
    }

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private URL inputUrl;

    @Test
    public void build_urlGivenNotNullInputUrl_returnEncodedUrl() throws MalformedURLException {
        Mockito.when(inputUrl.toURI()).thenReturn(new URI("http://example.com/path?param=value"));
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedEncodedUrl = "http%3A%2F%2Fexample.com%2Fpath%3Fparam%3Dvalue";
        assert (urlBuilder.build().toURI().toString().equals(expectedEncodedUrl));
    }

}