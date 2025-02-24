package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        URL inputUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL build = urlBuilder.build();
        assertNull(build);
    }

}