package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedBuildUrlTest_ConstructsUrlWithGivenUrlAndMultipleQueryParams {

    @Test
    public void buildUrlTest_ConstructsUrlWithGivenUrlAndMultipleQueryParams() {
        // Arrange
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        KeyVal keyVal1 = new KeyVal("key1", "value1");
        KeyVal keyVal2 = new KeyVal("key2", "value2");

        // Act
        URL result = urlBuilder.appendKeyVal(keyVal1).appendKeyVal(keyVal2).build();

        // Assert
        assertEquals(inputUrl + "?key1=value1&key2=value2", result.toString());
    }

}