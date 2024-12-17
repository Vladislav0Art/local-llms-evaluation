package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestUrlBuilderConstructor_InvalidProtocol {

    @Test
    public void testUrlBuilderConstructor_InvalidProtocol() {
        URL url = new URL("invalid: protocol");
        assertThrows(MalformedURLException.class, () -> UrlBuilder.builder(url));
    }

}