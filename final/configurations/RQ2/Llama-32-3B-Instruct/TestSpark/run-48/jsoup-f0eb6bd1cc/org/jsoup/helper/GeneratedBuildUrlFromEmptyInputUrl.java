package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder.DataKeyValTestHelper;

public class GeneratedBuildUrlFromEmptyInputUrl {

    @Test
    public void buildUrlFromEmptyInputUrl() throws MalformedURLException {
        assertTrue(UrlBuilder.build(null).toString().isEmpty());
    }

}