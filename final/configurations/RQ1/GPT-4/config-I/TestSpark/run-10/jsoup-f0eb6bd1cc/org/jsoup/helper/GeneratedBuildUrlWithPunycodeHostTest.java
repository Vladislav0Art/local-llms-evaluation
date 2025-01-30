package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithPunycodeHostTest {

    @Test
    public void buildUrlWithPunycodeHostTest() throws Exception {
        URL inputUrl = new URL("https://www.例子.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertThat(outputUrl.getHost(), equalTo("www.xn--fsq.com"));
    }

}