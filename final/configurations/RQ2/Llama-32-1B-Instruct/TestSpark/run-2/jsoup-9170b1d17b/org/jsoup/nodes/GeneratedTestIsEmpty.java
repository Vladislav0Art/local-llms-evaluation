package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestIsEmpty {

    private String key;
    private Object value;

    @Test
    public void testIsEmpty() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.isEmpty());

        attrs.remove();
        assertFalse(attrs.isEmpty());
    }

}