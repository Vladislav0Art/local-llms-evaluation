package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestHasDeclaredValueForKeys {

    private String key;
    private Object value;

    @Test
    public void testHasDeclaredValueForKeys() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasDeclaredValueForKey(value)).thenReturn(true);

        assertTrue(attrs.hasDeclaredValueForKey(value));
        verify(hasDeclaredValueForKey, times(1)).hasDeclaredValueForKeyIgnoreCaseIgnoreCase(key);
    }

}