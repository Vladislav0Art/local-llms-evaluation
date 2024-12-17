package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestUrlBuilderConstructor_EmptyHost {

    @Test
    public void testUrlBuilderConstructor_EmptyHost() {
        String url = "";
        assertThrows(MalformedURLException.class, () -> UrlBuilder.builder(new java.net.URL(url)));
    }

}