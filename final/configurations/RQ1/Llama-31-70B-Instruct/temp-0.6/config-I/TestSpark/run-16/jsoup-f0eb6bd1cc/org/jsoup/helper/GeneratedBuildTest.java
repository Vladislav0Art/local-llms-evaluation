package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertNotNull(urlBuilder.build());
    }

}