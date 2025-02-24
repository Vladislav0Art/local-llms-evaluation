package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedBuildTest_withInvalidUrl {

    @Test
    public void buildTest_withInvalidUrl() throws Exception {
        URL inputUrl = new URL("invalidurl");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        urlBuilder.build();
    }

}