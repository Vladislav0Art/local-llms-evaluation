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
public class GeneratedBuild_URLReturnsInvalidURL {

    @Mock
    private Connection connection;

    public UrlBuilder testUrlBuilder() {
        return new UrlBuilder(new URL("https://example.com"));
    }

    @Test
    public void build_URLReturnsInvalidURL() {
        // Given:
        UrlBuilder builder = testUrlBuilder();

        // When: building the invalid URL
        try {
            builder.build();
            fail("NullPointerException was not thrown");
        } catch (NullPointerException e) {
            // Then: exception is thrown with correct error message
            assertNull(e.getMessage());
        }
    }

}