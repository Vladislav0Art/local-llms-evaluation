package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithNullURLTest {

    @Test
    public void buildWithNullURLTest() {
        UrlBuilder builder = new UrlBuilder(null);
        builder.build();
    }

}