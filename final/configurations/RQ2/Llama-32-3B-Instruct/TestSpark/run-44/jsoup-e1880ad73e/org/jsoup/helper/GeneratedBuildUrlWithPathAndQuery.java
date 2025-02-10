package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithPathAndQuery {

    @Test
    public void buildUrlWithPathAndQuery() throws UnsupportedEncodingException {
        when(new Connection.Builder()
                .scheme("https")
                .authority("example.com")
                .path("/test")
                .query(StringUtil.UTF_8("key=value"))
                .build()).thenReturn(new URL("https://example.com/test?key=value"));
        UrlBuilder builder = new UrlBuilder(null);
        URL result = builder.build();
        assertEquals(new URL("https://example.com/test?key=value"), result);
    }

}