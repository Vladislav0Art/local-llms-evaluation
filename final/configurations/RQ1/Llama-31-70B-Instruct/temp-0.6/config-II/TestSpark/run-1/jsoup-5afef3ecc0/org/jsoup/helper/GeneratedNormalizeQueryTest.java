package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringUtil;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNormalizeQueryTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = Mockito.mock(UrlBuilder.class);
    }

    @Test
    public void normalizeQueryTest() {
        String query = "?key1=value1&key2=value2";
        String expectedQuery = "?key1=value1&key2=value2";

        String actualQuery = UrlBuilder.normalizeQuery(query);

        assertEquals(expectedQuery, actualQuery);
    }

}