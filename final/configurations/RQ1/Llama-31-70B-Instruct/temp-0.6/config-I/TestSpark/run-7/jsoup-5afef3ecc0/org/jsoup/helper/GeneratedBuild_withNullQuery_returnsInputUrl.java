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
public class GeneratedBuild_withNullQuery_returnsInputUrl {

    @Test
    public void build_withNullQuery_returnsInputUrl() throws URISyntaxException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL actual = urlBuilder.build();

        Assert.assertEquals(inputUrl, actual);
    }

}