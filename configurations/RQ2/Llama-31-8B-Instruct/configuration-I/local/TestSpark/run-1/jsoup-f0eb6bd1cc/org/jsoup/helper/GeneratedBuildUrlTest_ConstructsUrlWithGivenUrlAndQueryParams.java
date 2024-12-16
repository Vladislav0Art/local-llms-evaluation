package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlTest_ConstructsUrlWithGivenUrlAndQueryParams {

    @Test
    public void buildUrlTest_ConstructsUrlWithGivenUrlAndQueryParams() {
        // Arrange
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        KeyVal keyVal = new KeyVal("key", "value");

        // Act
        URL result = urlBuilder.appendKeyVal(keyVal).build();

        // Assert
        assertEquals(inputUrl + "?key=value", result.toString());
    }

}