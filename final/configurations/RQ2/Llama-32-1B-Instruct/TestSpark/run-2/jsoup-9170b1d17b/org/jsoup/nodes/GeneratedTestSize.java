package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestSize {

    private String key;
    private Object value;

    @Test
    public void testSize() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertDoesNotThrow();

        assertEquals(1, attrs.size());
        verify(add, times(1)).add(key, value);
    }

}