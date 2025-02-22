package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithNullUrlTest {

    @Test
    public void buildWithNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(NullPointerException.class, urlBuilder::build);
    }

}