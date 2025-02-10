package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppendKeyVal_MethodAppendsKeyValCorrectly {

    @Mock
    private URL url;

    @Test
    public void appendKeyVal_MethodAppendsKeyValCorrectly() {
        when(url.toURI()).thenReturn(new URI("http://example.com"));
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(Connection.KeyVal.valueOf("key", "value"));
            assertFalse(true); // Should throw exception
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}