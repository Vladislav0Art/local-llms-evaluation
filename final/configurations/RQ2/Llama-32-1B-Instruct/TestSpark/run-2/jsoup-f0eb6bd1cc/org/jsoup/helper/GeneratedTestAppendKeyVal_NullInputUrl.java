package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAppendKeyVal_NullInputUrl {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_NullInputUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        Map<String, String> kv = new HashMap<>();
        urlBuilder.appendKeyVal(kv);
        assertNull(urlBuilder.build());
    }

}