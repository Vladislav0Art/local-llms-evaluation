package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildUrlReturnsNullWhenInputIsNull {

    @Test
    public void buildUrlReturnsNullWhenInputIsNull() {
        assertNull(new UrlBuilder(null).build());
    }

}