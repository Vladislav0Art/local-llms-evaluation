package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlTest_ConstructsUrlWithGivenUrl {

    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlTest_ConstructsUrlWithGivenUrl() {
        try {
            URL inputUrl = new URL("https://example.com");
            urlBuilder = new UrlBuilder(inputUrl);
            assertEquals(inputUrl, urlBuilder.build());
        } catch (MalformedURLException e) {
            assert false;
        }
    }

}