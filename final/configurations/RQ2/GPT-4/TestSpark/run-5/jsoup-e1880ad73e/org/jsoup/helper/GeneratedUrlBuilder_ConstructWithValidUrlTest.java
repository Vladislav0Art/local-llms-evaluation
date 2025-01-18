package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedUrlBuilder_ConstructWithValidUrlTest {

    @Test
    public void urlBuilder_ConstructWithValidUrlTest() {
        try {
            URL inputUrl = new URL("https://this.is.a.valid.url/path");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            Assert.assertNotNull(urlBuilder);
        } catch (MalformedURLException e) {
            // This wouldn't occur as the URL supplied is valid
        }
    }

}