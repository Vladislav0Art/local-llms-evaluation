package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

}