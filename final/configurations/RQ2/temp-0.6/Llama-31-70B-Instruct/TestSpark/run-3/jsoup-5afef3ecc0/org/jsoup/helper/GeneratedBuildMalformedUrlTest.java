package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildMalformedUrlTest {

    @Test
    public void buildMalformedUrlTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://invalid:80"));
        assertNull(urlBuilder.build());
    }

}