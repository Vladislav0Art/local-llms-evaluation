package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlWithBasicFormatTest {

    @Test
    public void buildUrlWithBasicFormatTest() {
        String url = "http://example.com/path?query=value";
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("http://example.com/path?query=value", builder.build());
    }

}