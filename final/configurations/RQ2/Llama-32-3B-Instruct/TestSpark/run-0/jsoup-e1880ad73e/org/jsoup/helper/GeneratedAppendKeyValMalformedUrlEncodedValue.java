package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.jsoup.helper.DataUtil.UTF_8;
import static org.jsoup.helper.UrlBuilder.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValMalformedUrlEncodedValue {

    @RunWith(MockitoJUnitRunner.class)
    public class UrlBuilderTest {

        @Mock
        private Connection connection;

        @Mock
        private URL url;

        @Test
        public void appendKeyValMalformedUrlEncodedValue() {
            fail("URL encoded value should not be malformed");
        }
    }

    public static class URLUtil {

        public static URI buildUri(URI uri, Connection.KeyVal kv) throws URISyntaxException {
            if (kv != null) {
                String key = kv.getKey();
                String value = kv.getValue();
                if (value == null) {
                    return uri;
                }
                return new URI(uri.getScheme(), uri.getHost(), uri.getPath() + "?" + key + "=" + URLDecoder.decode(value, "UTF-8"), uri.getQuery());
            } else {
                return uri;
            }
        }
    }

}