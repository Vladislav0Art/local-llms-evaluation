package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestAddAttributes {

    private String key;
    private Object value;

    @Test
    public void testAddAttributes() {
        Attributes attrs = new Attributes();
        Attr attr1 = new Attr("attr1", "value1");
        Attr attr2 = new Attr("attr2", "value2");
        when(attrs.add(attr1.key, attr1.value)).thenReturn(true);
        when(attrs.add(attr2.key, attr2.value)).thenReturn(true);

        assertTrue(attrs.add(attr1.key, "value1"));
        assertTrue(attrs.add(attr2.key, "value2"));
    }

}