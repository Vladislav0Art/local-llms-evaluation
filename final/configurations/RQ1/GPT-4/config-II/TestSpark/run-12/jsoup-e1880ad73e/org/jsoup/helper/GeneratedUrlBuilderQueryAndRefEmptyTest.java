package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedUrlBuilderQueryAndRefEmptyTest {

    @Test
    public void UrlBuilderQueryAndRefEmptyTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.test.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        // check that builder is not null (as we've passed in a legal URL)
        assertNotNull(urlBuilder);
        // check that query string has not been populated (no params passed)
        assertNull(urlBuilder.q);
    }

}