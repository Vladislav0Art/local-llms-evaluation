package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Before;
import org.junit.After;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedBuildTestWithRef {

    @Mock
    private URL inputUrl;

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @After
    public void tearDown() {
        urlBuilder = null;
    }

    @Test
    public void buildTestWithRef() {
        Mockito.when(inputUrl.getRef()).thenReturn("ref");
        URL actual = urlBuilder.build();
        assertNotNull(actual);
    }

}