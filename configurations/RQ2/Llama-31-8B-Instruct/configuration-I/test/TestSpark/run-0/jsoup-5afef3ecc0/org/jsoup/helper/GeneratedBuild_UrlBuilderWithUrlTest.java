package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_UrlBuilderWithUrlTest {

    private UrlBuilder urlBuilder;

    @Test
    public void build_UrlBuilderWithUrlTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

}