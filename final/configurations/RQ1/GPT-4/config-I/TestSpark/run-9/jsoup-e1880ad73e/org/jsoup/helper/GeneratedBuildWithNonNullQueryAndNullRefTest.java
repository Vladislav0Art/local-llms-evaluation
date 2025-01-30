package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedBuildWithNonNullQueryAndNullRefTest {

    Connection.KeyVal .class,UrlBuilder .class
})

public class UrlBuilderTest {

    @Mock
    Connection.KeyVal kv;

    @Test
    public void buildWithNonNullQueryAndNullRefTest() {
        try {
            URL url = new URL("https://test.com?key=value");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            assertTrue(urlBuilder.build().toString().contains("key=value"));
        } catch (Exception ex) {
            fail("No exception should be thrown.");
        }
    }

}