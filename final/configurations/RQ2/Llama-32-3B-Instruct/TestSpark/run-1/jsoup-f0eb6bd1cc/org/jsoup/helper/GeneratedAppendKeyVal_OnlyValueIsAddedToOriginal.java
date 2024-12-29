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
public class GeneratedAppendKeyVal_OnlyValueIsAddedToOriginal {

    @Mock
    private Connection connection;

    public UrlBuilder testUrlBuilder() {
        return new UrlBuilder(new URL("https://example.com"));
    }

    @Test
    public void appendKeyVal_OnlyValueIsAddedToOriginal() throws MalformedURLException, URISyntaxException {
        // Given: original URL and key-value pair
        String original = "https://example.com";
        Connection.KeyVal kv = new KeyVal("key", null);
        UrlBuilder builder = testUrlBuilder();

        // When: adding the key-value pair to the original URL
        builder.appendKeyVal(kv);

        // Then: expected modified URL is returned
        String result = builder.build().toString();
        assertEquals(original + "?" + emptyString, result);
    }

}