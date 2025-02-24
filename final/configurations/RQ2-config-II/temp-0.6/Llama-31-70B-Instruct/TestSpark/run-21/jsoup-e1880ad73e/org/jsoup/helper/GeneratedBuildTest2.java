package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildTest2 {

    @Test
    public void buildTest2() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL build = urlBuilder.build();
        assertEquals("http://www.example.com/", build.toString());
    }

}