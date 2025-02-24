package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildTest_NoInputUrl {

    @Test
    public void buildTest_NoInputUrl() throws Exception {
        URL inputUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertNull(url);
    }

}