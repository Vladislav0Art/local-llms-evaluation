package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.jsoup.util.DataUtil;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedBuildUrlWithFragment {

    @Test
    public void buildUrlWithFragment() {
        // Given
        URL url = new URL("http://example.com#fragment");
        String fragment = "anchor";

        // When
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();

        // Then
        assertEquals(result.getFragment(), fragment);
    }

}