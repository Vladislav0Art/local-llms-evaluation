package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUrlBuilderConstructionTest {

    @Test
    public void urlBuilderConstructionTest() {
        URL u = new URL("http://example.com/path?a=1&b=2#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        assert builder.u == u : "Url not copied correctly";
        assert builder.q != null : "Query string should be initialized";
    }

}