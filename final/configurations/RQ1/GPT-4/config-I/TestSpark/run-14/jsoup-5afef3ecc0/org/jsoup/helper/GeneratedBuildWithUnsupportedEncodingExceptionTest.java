package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithUnsupportedEncodingExceptionTest {

    @Mock
    private Connection.KeyVal keyValMock;

    @Test
    public void buildWithUnsupportedEncodingExceptionTest() throws Exception {
        URL testUrl = new URL("http://example.com/呵呵");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        urlBuilder.build();
    }

}