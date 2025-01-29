package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestHasDeclaredValuesForKeys {

    private String key;
    private Object value;

    @Test
    public void testHasDeclaredValuesForKeys() {
        Attributes attrs = new Attributes();
        value1 = "value1";
        value2 = "value2";
        when(attrs.hasDeclaredValueForKey(value1)).thenReturn(true);
        when(attrs.hasDeclaredValueForKey(value2)).thenReturn(true);

        assertTrue(attrs.hasDeclaredValueForKey(value1));
        assertTrue(attrs.hasDeclaredValueForKey(value2));
    }

}