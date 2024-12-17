package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestUrlBuilderConstructor_FailedHostEncoding {

    @Test
    public void testUrlBuilderConstructor_FailedHostEncoding() {
        String url = "invalid: host";
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.builder(new URL(url)));
    }

}