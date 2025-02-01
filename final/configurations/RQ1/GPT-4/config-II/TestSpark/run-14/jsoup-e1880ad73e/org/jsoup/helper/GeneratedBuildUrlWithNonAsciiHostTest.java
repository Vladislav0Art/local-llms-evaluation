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

public class GeneratedBuildUrlWithNonAsciiHostTest {

    @Test
    public void buildUrlWithNonAsciiHostTest() throws Exception {
        URL url = new URL("http://www.测试.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals(newUrl.getHost(), "www.xn--0zwm56d.com");
    }

}