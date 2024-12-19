package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.util.Base64;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestNewUrlBuilderFromUrlIsNotNull {

    private UrlBuilder urlBuilder;

    @org.junit.Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    public UrlBuilder getUrlBuilder() {
        return urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testNewUrlBuilderFromUrlIsNotNull() {
        urlBuilder = getUrlBuilder();

        assertNotNull(urlBuilder);
    }

}