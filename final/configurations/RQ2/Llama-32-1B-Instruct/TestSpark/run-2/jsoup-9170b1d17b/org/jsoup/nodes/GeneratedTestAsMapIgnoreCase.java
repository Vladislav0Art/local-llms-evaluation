package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestAsMapIgnoreCase {

    private String key;
    private Object value;

    @Test
    public void testAsMapIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.add("key", "Value");
        Attr attr = new Attr("attr", "value");

        Map<Attr, Object> map = attrs.asMapIgnoreCase();

        assertEquals(2, map.size());
        verify(asMapIgnoreCase, times(1)).add(key, value);
    }

}