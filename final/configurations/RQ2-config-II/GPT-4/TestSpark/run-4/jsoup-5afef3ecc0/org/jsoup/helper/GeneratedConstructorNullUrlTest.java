package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConstructorNullUrlTest {

    @Test
    public void constructorNullUrlTest() {
        UrlBuilder builder = new UrlBuilder(null);
    }

}