package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.jsoup.Connection.KeyVal;
import static org.jsoup.helper.DataUtil.UTF_8;
import static org.jsoup.internal.StringUtil.emptyString;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_ThrowsUnsupportedEncodingException {

    @Mock
    private Connection connection;

    public UrlBuilder testUrlBuilder() {
        return new UrlBuilder(new URL("https://example.com"));
    }

    @Test
    public void appendKeyVal_ThrowsUnsupportedEncodingException() {
        // Given: original URL and key-value pair with non-ASCII value
        String original = "https://example.com";
        Connection.KeyVal kv = new KeyVal("key", "äöü");
        UrlBuilder builder = testUrlBuilder();

        // When: adding the key-value pair to the original URL
        try {
            builder.appendKeyVal(kv);
            fail("UnsupportedEncodingException was not thrown");
        } catch (UnsupportedEncodingException e) {
            // Then: exception is thrown with correct error message
            assertEquals(UTF_8, e.getMessage());
        }
    }

}