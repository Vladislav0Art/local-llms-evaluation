package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestHasDeclaredValueForKey {

    private String key;
    private Object value;

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasDeclaredValueForKey(key)).thenReturn(true);

        assertTrue(attrs.hasDeclaredValueForKey(key));
        verify(hasDeclaredValueForKey, times(1)).hasDeclaredValueForKeyIgnoreCase(key);
    }

}