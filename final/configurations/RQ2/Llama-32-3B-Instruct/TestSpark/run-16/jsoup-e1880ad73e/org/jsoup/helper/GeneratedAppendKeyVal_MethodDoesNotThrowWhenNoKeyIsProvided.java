package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_MethodDoesNotThrowWhenNoKeyIsProvided {

    @Mock
    private Connection connection;

    @Mock
    private URL url;

    @Mock
    private String key;
    @Mock
    private String value;

    public static class TestClass {
        public UrlBuilderTest createUrlBuilderTest() {
            new UrlBuilder(url);
            return new UrlBuilderTest();
        }
    }

    /**
     * Test that the constructor is called with inputUrl.
     */

    @Test
    public void appendKeyVal_MethodDoesNotThrowWhenNoKeyIsProvided() throws Exception {
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = null;
        try {
            builder.appendKeyVal(kv);
            assertNull(kv.getKey());
        } catch (UnsupportedEncodingException e) {
            fail();
        }
    }

}