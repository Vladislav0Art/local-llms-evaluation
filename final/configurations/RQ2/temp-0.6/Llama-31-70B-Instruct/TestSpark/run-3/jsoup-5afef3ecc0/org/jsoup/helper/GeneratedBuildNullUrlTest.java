package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildNullUrlTest {

    @Test
    public void buildNullUrlTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNull(urlBuilder.build());
    }

}