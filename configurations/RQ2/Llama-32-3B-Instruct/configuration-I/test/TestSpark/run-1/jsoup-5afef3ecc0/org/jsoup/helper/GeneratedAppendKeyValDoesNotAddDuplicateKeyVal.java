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
public class GeneratedAppendKeyValDoesNotAddDuplicateKeyVal {

    @Mock
    private URL inputUrl;

    @Test
    public void appendKeyValDoesNotAddDuplicateKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Map<String, String> keyValMap = new HashMap<>();
        keyValMap.put("key", "value");
        Connection.KeyVal kv1 = Connection.KeyVal.valueOf(keyValMap);
        urlBuilder.appendKeyVal(kv1);
        Map<String, String> duplicateKeyValMap = new HashMap<>();
        duplicateKeyValMap.put("key", "value");
        Connection.KeyVal kv2 = Connection.KeyVal.valueOf(duplicateKeyValMap);
        urlBuilder.appendKeyVal(kv2);
        assertEquals(1, inputUrl.getQuery().split("&").length);
    }

}