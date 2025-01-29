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

public class GeneratedAppendKeyVal_Simple {

    @Mock
    private Connection.KeyVal mockKeyVal;

    private UrlBuilder underTest;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        underTest = new UrlBuilder(null);
    }

    @Test
    public void appendKeyVal_Simple() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource");
        underTest.appendKeyVal(mockKeyVal);
        assertEquals(0, urlBuilder.build().getQueryLength());
    }

}