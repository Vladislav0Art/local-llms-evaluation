package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedBuild_WithNonAsciiPath_ReturnsURL {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
    }

    @After
    public void tearDown() {
        urlBuilder = null;
    }

    @Test
    public void build_WithNonAsciiPath_ReturnsURL() {
        urlBuilder.build();
    }

}