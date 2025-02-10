package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithSchemeAndAuthority {

    @Test
    public void buildUrlWithSchemeAndAuthority() {
        when(new Connection.Builder()
                .scheme("https")
                .authority("example.com")
                .build()).thenReturn(new URL("https://example.com"));
        UrlBuilder builder = new UrlBuilder(null);
        URL result = builder.build();
        assertEquals(new URL("https://example.com"), result);
    }

}