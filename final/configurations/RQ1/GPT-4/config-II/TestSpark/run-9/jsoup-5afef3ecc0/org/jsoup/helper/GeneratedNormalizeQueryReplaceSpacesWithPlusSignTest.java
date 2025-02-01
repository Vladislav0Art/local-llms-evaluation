package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedNormalizeQueryReplaceSpacesWithPlusSignTest {

    @Test
    public void normalizeQueryReplaceSpacesWithPlusSignTest() {
        String q = "query with space";
        String expected = "query+with+space";

        Assert.assertEquals(expected, UrlBuilder.normalizeQuery(q));
    }

}