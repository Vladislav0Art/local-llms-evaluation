package org.jsoup.helper;

import org.jsoup.helper.URL;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

public class GeneratedUrlBuilder_Build_WithDefaultUrl_ReturnsUrl {

    @Test
    public void urlBuilder_Build_WithDefaultUrl_ReturnsUrl() {
        URL defaultUrl = new URL("http://localhost");
        UrlBuilder urlBuilder = new UrlBuilder(defaultUrl);
        urlBuilder.build();
    }

}