package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
        assertEquals(Mockito.mock(URL.class), urlBuilder.build());
    }

}