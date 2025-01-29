package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestGetIgnoreCase {

    private String key;
    private Object value;

    @Test
    public void testGetIgnoreCase() {
        Attributes attrs = new Attributes();
        when(attrs.indexOfKey(key)).thenReturn(0);
        when(attrs.getIgnoreCase("key")).thenReturn(value);

        assertEquals("key", attrs.getIgnoreCase("key"));
        verify(get, times(1)).getIgnoreCase("key");
    }

}