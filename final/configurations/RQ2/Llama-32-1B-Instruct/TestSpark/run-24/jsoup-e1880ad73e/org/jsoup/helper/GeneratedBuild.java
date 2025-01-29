package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedBuild {

    @Mock
    private Connection.KeyVal mockKeyVal;

    private UrlBuilder underTest;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        underTest = new UrlBuilder(null);
    }

    @Test
    public void build() {
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource");
        assertTrue(urlBuilder.build().getScheme());
        assertTrue(urlBuilder.build().getHost());
        assertTrue(urlBuilder.build().getPort());
        assertEquals(80, urlBuilder.build().getScheme().toString().length());
    }

}