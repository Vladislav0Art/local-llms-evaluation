package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithMalformedUrlTest {

    @Test
    public void buildWithMalformedUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("malformed_url"));
        assertThrows(MalformedURLException.class, urlBuilder::build);
    }

}