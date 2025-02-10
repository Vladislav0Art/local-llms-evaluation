package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildDefaultUrl {

    @Test
    public void buildDefaultUrl() {
        when(new Connection.Builder().build()).thenReturn(new URL("https://example.com"));
        UrlBuilder builder = new UrlBuilder(null);
        URL result = builder.build();
        assertEquals(new URL("https://example.com"), result);
    }

}