package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderNullUrlTest {

    @Test
    public void UrlBuilderNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

}