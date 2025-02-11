package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUrlBuilderNormalizationWithQueryAndFragmentTest {

    @Test
    public void urlBuilderNormalizationWithQueryAndFragmentTest() {
        URL u = new URL("http://example.com/path?a=1&b=2#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        builder.build();
        String query = u.getQuery();
        assertEquals("?a=1&b=2", query);
        String fragment = u.getRef();
        assertEquals("#fragment", fragment);
    }

}