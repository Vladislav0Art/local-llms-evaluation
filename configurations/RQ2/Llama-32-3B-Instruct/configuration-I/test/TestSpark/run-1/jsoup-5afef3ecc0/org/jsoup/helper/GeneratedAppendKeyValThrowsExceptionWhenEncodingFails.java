package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValThrowsExceptionWhenEncodingFails {

    @Mock
    private URL inputUrl;

    @Test
    public void appendKeyValThrowsExceptionWhenEncodingFails() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Map<String, String> keyValMap = new HashMap<>();
        keyValMap.put("key", "value");
        Connection.KeyVal kv = Connection.KeyVal.valueOf(keyValMap);
        when(Connection.UTF8Encoder.encode(anyString())).thenThrow(UnsupportedEncodingException.class);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}