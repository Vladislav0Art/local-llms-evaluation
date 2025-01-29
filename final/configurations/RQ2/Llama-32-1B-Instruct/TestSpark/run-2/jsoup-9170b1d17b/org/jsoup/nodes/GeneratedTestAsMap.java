package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestAsMap {

    private String key;
    private Object value;

    @Test
    public void testAsMap() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attr attr = new Attr("attr", "value");

        Map<Attr, Object> map = attrs.asMap();

        assertEquals(2, map.size());
        verify(asMap, times(1)).add(key, value);
    }

}