package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithNonAsciiPathTest {

    @Test
    public void buildUrlWithNonAsciiPathTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/路径");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertThat(outputUrl.getPath(), equalTo("/%E8%B7%AF%E5%BE%84"));
    }

}