package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestAsMapIgnoreCaseIgnoreCase {

    private String key;
    private Object value;

    @Test
    public void testAsMapIgnoreCaseIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attr attr = new Attr("attr", "Value");

        Map<Attr, Object> map = attrs.asMapIgnoreCaseIgnoreCase();

        assertEquals(2, map.size());
        verify(asMapIgnoreCaseIgnoreCase, times(1)).add(key, value);
    }

}