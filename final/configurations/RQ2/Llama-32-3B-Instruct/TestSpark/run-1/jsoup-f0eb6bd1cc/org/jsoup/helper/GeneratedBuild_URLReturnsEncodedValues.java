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
public class GeneratedBuild_URLReturnsEncodedValues {

    @Mock
    private Connection connection;

    public UrlBuilder testUrlBuilder() {
        return new UrlBuilder(new URL("https://example.com"));
    }

    @Test
    public void build_URLReturnsEncodedValues() throws MalformedURLException, URISyntaxException {
        // Given: original URL and key-value pair
        String original = "https://example.com";
        Connection.KeyVal kv = new KeyVal("key", "value");
        UrlBuilder builder = testUrlBuilder();

        // When: building the URL
        URL result = builder.build();

        // Then: expected modified URL is returned with encoded values
        assertEquals(original + "?key=" + URLDecoder.decode(kv.getValue(), UTF_8), result.toString());
    }

}