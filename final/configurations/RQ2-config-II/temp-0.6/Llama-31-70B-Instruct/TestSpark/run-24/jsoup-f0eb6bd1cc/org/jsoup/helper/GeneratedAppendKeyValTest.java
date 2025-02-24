package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        URL url = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // Act
        urlBuilder.appendKeyVal(null);
    }

}