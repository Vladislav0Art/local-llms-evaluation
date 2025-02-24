package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildValidUrlTest {

    @Test
    public void buildValidUrlTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://valid.com"));
        assertNotNull(urlBuilder.build());
    }

}