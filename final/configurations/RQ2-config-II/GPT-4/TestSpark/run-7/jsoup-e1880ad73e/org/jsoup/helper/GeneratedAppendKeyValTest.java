package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URL;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        urlBuilder.appendKeyVal(mockKeyVal);
    }

}