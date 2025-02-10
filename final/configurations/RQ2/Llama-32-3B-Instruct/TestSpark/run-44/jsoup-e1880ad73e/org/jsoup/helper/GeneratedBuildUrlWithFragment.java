package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithFragment {

    @Test
    public void buildUrlWithFragment() throws UnsupportedEncodingException {
        when(new Connection.Builder()
                .scheme("https")
                .authority("example.com")
                .fragment("#anchor")
                .build()).thenReturn(new URL("https://example.com#anchor"));
        UrlBuilder builder = new UrlBuilder(null);
        URL result = builder.build();
        assertEquals(new URL("https://example.com#anchor"), result);
    }

}