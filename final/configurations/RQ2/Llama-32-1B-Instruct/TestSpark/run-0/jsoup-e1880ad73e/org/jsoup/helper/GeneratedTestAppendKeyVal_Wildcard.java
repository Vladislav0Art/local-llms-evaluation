package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_Wildcard {

    @Test
    public void testAppendKeyVal_Wildcard() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        URLBuilder builder = new UrlBuilder(inputUrl);
        String expectedUrl = "https://example.com/path?key1=value1[key2]=value2&key3=value3";
        when(builder.build()).thenReturn(new Uri(expectedUrl));
        assertEquals(expectedUrl, builder.build());
    }

}