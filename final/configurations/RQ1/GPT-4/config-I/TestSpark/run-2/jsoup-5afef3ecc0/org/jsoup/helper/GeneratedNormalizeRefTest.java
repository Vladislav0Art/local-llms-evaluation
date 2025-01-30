package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() {
        String ref = "reference with spaces";
        String expectedNormalizedRef = "reference%20with%20spaces";

        String actualNormalizedRef = UrlBuilder.normalizeRef(ref);

        Assert.assertEquals(expectedNormalizedRef, actualNormalizedRef);
    }

}