package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.net.URL;

@RunWith(PowerMockRunner.class)
public class GeneratedBuildUrlWithQueryParams {

    @Test
    public void buildUrlWithQueryParams() {
        URL inputUrl = new URL("https://www.example.com?a=1&b=2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedUrl = "https://www.example.com";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

}