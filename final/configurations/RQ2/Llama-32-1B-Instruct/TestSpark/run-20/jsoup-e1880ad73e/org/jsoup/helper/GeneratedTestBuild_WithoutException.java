package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestBuild_WithoutException {

    private UrlBuilder urlBuilder;

    @BeforeEach
    public void init() {
        urlBuilder = new UrlBuilder("http://example.com");
    }

    @Test
    public void testBuild_WithoutException() {
        URL url = null;
        Mockito.when(urlBuilder.build()).thenReturn(null);
        String result = urlBuilder.build();
        assertThat(result, is(url));
    }

}