package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.jsoup.util.DataUtil;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedBuildUrlWithQuery {

    @Test
    public void buildUrlWithQuery() {
        // Given
        URL url = new URL("http://example.com?query=hello");
        String queryParam = "key=hello";

        // When
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();

        // Then
        assertTrue(result.getQuery().contains(queryParam));
    }

}