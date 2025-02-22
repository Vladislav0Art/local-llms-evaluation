package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderAppendKeyValTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void urlBuilderAppendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(urlBuilder.appendKeyVal(keyVal)).thenReturn(null);
    }

}