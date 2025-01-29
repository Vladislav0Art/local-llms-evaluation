package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestHasValueForKeyIgnoreCase {

    private String key;
    private Object value;

    @Test
    public void testHasValueForKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasKeyIgnoreCase(key)).thenReturn(true);

        assertTrue(attrs.hasKeyIgnoreCase(key));
        verify(hasKeyIgnoreCase, times(1)).hasDeclaredValueForKeyIgnoreCase(key);
    }

}