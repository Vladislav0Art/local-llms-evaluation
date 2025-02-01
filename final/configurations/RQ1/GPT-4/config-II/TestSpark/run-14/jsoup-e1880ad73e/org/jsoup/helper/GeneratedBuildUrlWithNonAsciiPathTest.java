package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithNonAsciiPathTest {

    @Test
    public void buildUrlWithNonAsciiPathTest() throws Exception {
        URL url = new URL("http://www.test.com/测试");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals(newUrl.getPath(), "/%E6%B5%8B%E8%AF%95");
    }

}