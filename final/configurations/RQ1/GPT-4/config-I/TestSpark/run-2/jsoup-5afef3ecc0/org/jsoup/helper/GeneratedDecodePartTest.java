package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() throws MalformedURLException {
        String encodedPart = "part%20with%20spaces";
        String expectedDecodedPart = "part with spaces";

        String actualDecodedPart = UrlBuilder.decodePart(encodedPart);

        Assert.assertEquals(expectedDecodedPart, actualDecodedPart);
    }

}