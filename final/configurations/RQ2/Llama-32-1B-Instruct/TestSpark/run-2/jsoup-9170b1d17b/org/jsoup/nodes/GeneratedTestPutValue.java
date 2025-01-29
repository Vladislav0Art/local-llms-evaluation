package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestPutValue {

    private String key;
    private Object value;

    @Test
    public void testPutValue() {
        Attributes attrs = new Attributes();
        attrs.put("key", value);
        when(attrs.put(value)).thenReturn(true);

        assertTrue(attrs.put("key", true));
        verify(put, times(1)).put(value);
    }

}