package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlBuilderWithQueryTest {

    @Test
    public void UrlBuilderWithQueryTest() {
        try {
            URL url = new URL("https://www.google.com/?query=test");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertNotNull(urlBuilder);
            assertEquals(url, urlBuilder.u);
            assertEquals(url.getQuery(), StringUtil.borrowBuilder().append(url.getQuery()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}