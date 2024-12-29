package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_Duplicates {

    @Test
    public void testAppendKeyVal_Duplicates() {
        String inputUrl = "https://example.com/path?a=b&c=d&a=e";
        URLBuilder builder = new UrlBuilder(inputUrl);
        String expectedUrl = "https://example.com/path?key1=value1[key2]=value2&key3=value3&a=e";
        when(builder.build()).thenReturn(new Uri(expectedUrl));
        assertEquals(expectedUrl, builder.build());
    }

}