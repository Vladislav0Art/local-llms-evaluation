package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void build_withNullQuery_returnsInputUrl() throws URISyntaxException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL actual = urlBuilder.build();

        Assert.assertEquals(inputUrl, actual);
    }

    @Test
    public void build_withQuery_returnsUrlWithEncodedQuery() throws URISyntaxException {
        URL inputUrl = new URL("http://example.com/?q=foo");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL actual = urlBuilder.build();

        Assert.assertEquals("http://example.com/?q=foo", actual.toString());
    }

    @Test
    public void build_withQueryWithPlusSign_returnsUrlWithEncodedQuery() throws URISyntaxException {
        URL inputUrl = new URL("http://example.com/?q=foo+bar");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL actual = urlBuilder.build();

        Assert.assertEquals("http://example.com/?q=foo+bar", actual.toString());
    }

}