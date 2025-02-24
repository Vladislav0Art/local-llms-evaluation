package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedTest {

    UrlBuilder .class,Connection.KeyVal .class,URL .class
})

public class UrlBuilderTests {

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = mock(URL.class);
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        // perform assertions
    }

    @Test
    public void appendKeyValTest() throws Exception {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValTest_null_kv() throws Exception {
        UrlBuilder builder = new UrlBuilder(null);
        try {
            builder.appendKeyVal(null);
            fail();
        } catch (NullPointerException e) {
            // expected exception
        }
    }

}