package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedNormalizeRefReplaceSpacesWithHecimal20Test {

    @Test
    public void normalizeRefReplaceSpacesWithHecimal20Test() {
        String r = "ref with space";
        String expected = "ref%20with%20space";

        Assert.assertEquals(expected, UrlBuilder.normalizeRef(r));
    }

}