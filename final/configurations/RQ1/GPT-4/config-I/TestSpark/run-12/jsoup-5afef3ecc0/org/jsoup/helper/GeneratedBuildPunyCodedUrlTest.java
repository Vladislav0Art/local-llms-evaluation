package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildPunyCodedUrlTest {

    @Test
    public void buildPunyCodedUrlTest() throws Exception {
        URL inputUrl = new URL("https://тест.испытание:8080/test?param=value#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertEquals("https://xn--e1aybc.xn--80akhbyknj4f:8080/test?param=value#ref", result.toString());
    }

}