package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() throws Exception {
        URL u = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(UrlBuilder.class, builder.getClass());
    }

}