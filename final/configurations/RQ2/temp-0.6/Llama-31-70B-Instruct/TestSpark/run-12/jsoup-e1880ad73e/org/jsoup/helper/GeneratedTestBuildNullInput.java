package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestBuildNullInput {

    @Test
    public void testBuildNullInput() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

}