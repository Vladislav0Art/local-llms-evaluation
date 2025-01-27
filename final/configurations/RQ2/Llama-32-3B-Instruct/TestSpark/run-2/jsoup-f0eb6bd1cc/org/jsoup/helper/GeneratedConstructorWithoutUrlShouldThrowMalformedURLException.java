package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.IDN;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

public class GeneratedConstructorWithoutUrlShouldThrowMalformedURLException {

    @Test
    public void constructorWithoutUrlShouldThrowMalformedURLException() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(null));
    }

}