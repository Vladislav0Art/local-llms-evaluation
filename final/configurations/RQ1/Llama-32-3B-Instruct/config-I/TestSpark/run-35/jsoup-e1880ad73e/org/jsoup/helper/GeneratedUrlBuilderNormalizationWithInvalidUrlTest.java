package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUrlBuilderNormalizationWithInvalidUrlTest {

    @Test
    public void urlBuilderNormalizationWithInvalidUrlTest() {
        URL u = new URL("http://example.com/invalid-path");
        UrlBuilder builder = new UrlBuilder(u);
        builder.build();
    }

}