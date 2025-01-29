package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestGetValue {

    private String key;
    private Object value;

    @Test
    public void testGetValue() {
        Attributes attrs = new Attributes();
        value = "value";
        when(attrs.getUserData(key)).thenReturn(value);

        assertEquals("value", attrs.get(key));
        verify(getUserData, times(1)).get(key);
    }

}