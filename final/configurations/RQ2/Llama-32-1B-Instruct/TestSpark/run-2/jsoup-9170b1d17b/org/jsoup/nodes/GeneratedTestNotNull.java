package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestNotNull {

    private String key;
    private Object value;

    @Test
    public void testNotNull() {
        Attributes attrs = new Attributes();
        when(attrs.checkNotNull(anyObject())).thenReturn(true);

        assertTrue(attrs.checkNotNull(value));
        verify(checkNotNull, never().returnValues(anyString()));
    }

}