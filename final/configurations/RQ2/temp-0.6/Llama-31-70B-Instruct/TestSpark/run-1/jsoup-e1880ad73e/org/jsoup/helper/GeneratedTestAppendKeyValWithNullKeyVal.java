package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTestAppendKeyValWithNullKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyValWithNullKeyVal() {
        urlBuilder.appendKeyVal(null);

        Assert.assertNull(urlBuilder.q);
    }

}