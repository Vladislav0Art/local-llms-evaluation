package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedBuild_NoInputUrl_ReturnsNull {

    @Mock
    private Connection connection;

    @Mock
    private URL url;

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("GeneratedTest");
    }

    @Test
    public void build_NoInputUrl_ReturnsNull() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNull(builder.build());
    }

}