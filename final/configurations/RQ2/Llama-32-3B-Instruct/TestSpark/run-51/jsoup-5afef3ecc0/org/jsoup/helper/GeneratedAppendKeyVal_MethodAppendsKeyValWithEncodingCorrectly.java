package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_MethodAppendsKeyValWithEncodingCorrectly {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private String inputUrl;

    @Test
    public void appendKeyVal_MethodAppendsKeyValWithEncodingCorrectly() throws UnsupportedEncodingException {
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal(kv);
            assertEquals("key=value", URLDecoder.decode(urlBuilder.build().toString(), DataUtil.UTF_8));
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}