package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUrlBuilderNormalizationWithNonAsciiPathTest {

    @Test
    public void urlBuilderNormalizationWithNonAsciiPathTest() {
        URL u = new URL("http://example.com/äöü/path?a=1&b=2#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        builder.build();
        URI uri = u.getURI();
        assertEquals("http", uri.getScheme());
        assert uri.getHost().equals(IDN.toASCII(DataUtil.decodePart(uri.getHost())));
    }

}