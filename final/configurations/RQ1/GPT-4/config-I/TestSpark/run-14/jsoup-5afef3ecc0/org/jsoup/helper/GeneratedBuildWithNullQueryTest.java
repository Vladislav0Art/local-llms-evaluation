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
public class GeneratedBuildWithNullQueryTest {

    @Mock
    private Connection.KeyVal keyValMock;

    @Test
    public void buildWithNullQueryTest() throws Exception {
        URL testUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        URL resultUrl = urlBuilder.build();

        assertNotNull(resultUrl);
        assertEquals(testUrl.toString(), resultUrl.toString());
    }

}