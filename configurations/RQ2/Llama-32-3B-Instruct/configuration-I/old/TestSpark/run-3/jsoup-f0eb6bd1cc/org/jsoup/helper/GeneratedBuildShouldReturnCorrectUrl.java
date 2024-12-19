package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedBuildShouldReturnCorrectUrl {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.helper.UrlBuilderTest");
    }

    @Test
    public void buildShouldReturnCorrectUrl() {
        // given:
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.inputUrl = new URL("https://www.example.com");

        // when
        String result = urlBuilder.build();

        // then
        org.junit.Assert.assertEquals(result, "https://www.example.com");
    }

}