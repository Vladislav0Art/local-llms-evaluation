package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestAsListIgnoreCase {

    private String key;
    private Object value;

    @Test
    public void testAsListIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.add("key", "Value");
        Attr attr = new Attr("attr", "value");

        List<Attribute> list = attrs.asListIgnoreCase();

        assertEquals(2, list.size());
        verify(asListIgnoreCase, times(1)).add(key, value);
    }

}