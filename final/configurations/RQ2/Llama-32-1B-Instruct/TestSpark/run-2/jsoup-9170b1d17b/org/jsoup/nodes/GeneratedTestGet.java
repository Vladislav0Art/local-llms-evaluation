package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestGet {

    private String key;
    private Object value;

    @Test
    public void testGet() {
        Attributes attrs = new Attributes();
        when(attrs.indexOfKey("key")).thenReturn(0);
        when(attrs.get("key")).thenReturn(value);

        assertEquals("key", attrs.get("key"));
        verify(get, times(1)).get("key");
    }

}