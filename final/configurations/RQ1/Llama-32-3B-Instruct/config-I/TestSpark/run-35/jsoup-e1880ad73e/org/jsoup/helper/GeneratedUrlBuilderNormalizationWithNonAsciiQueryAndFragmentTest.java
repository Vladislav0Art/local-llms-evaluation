package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUrlBuilderNormalizationWithNonAsciiQueryAndFragmentTest {

    @Test
    public void urlBuilderNormalizationWithNonAsciiQueryAndFragmentTest() {
        URL u = new URL("http://example.com/äöü/path?a=1&b=2#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        builder.build();
        String query = u.getQuery();
        assertEquals("?a=1%26b=2", query); // UTF-8 normalization
    }

}