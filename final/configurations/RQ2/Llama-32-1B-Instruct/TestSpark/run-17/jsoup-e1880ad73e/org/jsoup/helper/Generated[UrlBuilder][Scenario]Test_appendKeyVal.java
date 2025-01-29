package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Generated[UrlBuilder][Scenario]

Test_appendKeyVal {

    @Test
    public void [UrlBuilder][Scenario]Test_appendKeyVal() {
        KeyVal kv1 = new KeyVal("key1", "value1");
        KeyVal kv2 = new KeyVal("key2", "value2");
        UrlBuilder builder = mock(UrlBuilder.class);
        when(builder.appendKeyVal(kv1)).thenReturn(kv1);
        when(builder.appendKeyVal(kv2)).thenReturn(kv2);

        StringBuilder expected = new StringBuilder();
        UrlBuilder urlBuilder = new UrlBuilder(mock(URL.class));
        for (KeyVal kv : Arrays.asList(kv1, kv2)) {
            urlBuilder.appendKeyVal(kv);
        }
        assertEquals(expected.toString(), urlBuilder.build());
    }

}