package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestHasValueForKey {

    private String key;
    private Object value;

    @Test
    public void testHasValueForKey() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasKey(key)).thenReturn(true);

        assertTrue(attrs.hasKey(key));
        verify(hasKey, times(1)).hasDeclaredValueForKey(key);
    }

}