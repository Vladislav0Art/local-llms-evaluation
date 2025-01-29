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

public class GeneratedAppendKeyVal_WithEmptyMap {

    @Mock
    private Connection.KeyVal mockKeyVal;

    private UrlBuilder underTest;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        underTest = new UrlBuilder(null);
    }

    @Test
    public void appendKeyVal_WithEmptyMap() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource");
        underTest.appendKeyVal(java.util.Arrays.asList(null).stream().map(k -> (String) k).collect(java.util.Collections.emptyMap()));
        assertEquals(0, urlBuilder.build().getQueryLength());
    }

}