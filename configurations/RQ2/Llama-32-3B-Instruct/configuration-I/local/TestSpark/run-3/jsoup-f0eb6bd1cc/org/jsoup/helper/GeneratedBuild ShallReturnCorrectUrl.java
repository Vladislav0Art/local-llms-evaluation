package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild ShallReturnCorrectUrl {

    @Mock
    private Connection.KeyVal kv;

    @Spy
    private UrlBuilder urlBuilder;

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.helper.UrlBuilderTest");
    }

    @Test
    public void build

    ShallReturnCorrectUrl() {
        // given:
        urlBuilder.inputUrl = new URL("https://www.example.com");

        // when
        String result = urlBuilder.build();

        // then
        org.junit.Assert.assertEquals(result, "https://www.example.com");
    }

}