package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestUrlBuilding_withMalformedURL {

    @Mock
    private Connection connection;

    @RunWith(MockitoJUnitRunner.class)
    public void testUrlBuilder

    constructor() {
        // given
        URL inputUrl = new URL("https://www.example.com");
        // when
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        // then
        org.junit.Assert.assertNotNull(urlBuilder);
        org.junit.Assert.assertEquals(inputUrl, urlBuilder.inputUrl);
    }

    @Test
    public void testUrlBuilding_withMalformedURL() {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("invalid://www.example.com"));
        String query = "a=" + URLEncoder.encode("valueA", UTF_8) + "&b=2";
        // when
        try {
            urlBuilder.build(query);
            org.junit.Assert.fail();
        } catch (MalformedURLException e) {
            // expected exception
        }
    }

}