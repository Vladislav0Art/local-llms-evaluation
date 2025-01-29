package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestAddValue {

    private String key;
    private Object value;

    @Test
    public void testAddValue() {
        Attributes attrs = new Attributes();
        Attr attr = new Attr("attr", "value");
        when(attrs.putUserData(key, attr)).thenReturn(true);

        assertTrue(attrs.add(key, "value"));
        verify(add, times(1)).add(key, "value");
    }

}