package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCase {

    private String key;
    private Object value;

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.hasDeclaredValueForKeyIgnoreCase(key)).thenReturn(true);

        assertTrue(attrs.hasDeclaredValueForKeyIgnoreCase(key));
        verify(hasDeclaredValueForKeyIgnoreCase, times(1)).hasDeclaredValueForKeyIgnoreCaseIgnoreCase(key);
    }

}