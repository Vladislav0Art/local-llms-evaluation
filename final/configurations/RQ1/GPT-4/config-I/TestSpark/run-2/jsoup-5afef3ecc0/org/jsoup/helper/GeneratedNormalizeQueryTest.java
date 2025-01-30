package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() {
        String query = "query with spaces";
        String expectedNormalizedQuery = "query+with+spaces";

        String actualNormalizedQuery = UrlBuilder.normalizeQuery(query);

        Assert.assertEquals(expectedNormalizedQuery, actualNormalizedQuery);
    }

}