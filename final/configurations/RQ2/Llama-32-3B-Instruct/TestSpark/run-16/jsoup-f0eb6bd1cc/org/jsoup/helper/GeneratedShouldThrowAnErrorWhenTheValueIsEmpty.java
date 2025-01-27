package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(PowerMockRunner.class)
public class GeneratedShouldThrowAnErrorWhenTheValueIsEmpty {

    org.jsoup.Connection .class,StringUtil .class
})

public class UrlBuilderTest {

    @BeforeClass
    public static void setup() {
        MockitoAnnotations.initMocks(UrlBuilderTest.class);
    }

    @Mock
    private Connection connection;

    [MethodUnderTest][InitialisationTest]

    @Test
    public void shouldThrowAnErrorWhenTheValueIsEmpty() throws Exception {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "");
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal(kv);
            fail();
        } catch (UnsupportedEncodingException e) {
            assertNotNull(e);
        }
    }

}