package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestAsListIgnoreCaseIgnoreCase {

    private String key;
    private Object value;

    @Test
    public void testAsListIgnoreCaseIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attr attr = new Attr("attr", "Value");

        List<Attribute> list = attrs.asListIgnoreCaseIgnoreCase();

        assertEquals(2, list.size());
        verify(asListIgnoreCaseIgnoreCase, times(1)).add(key, value);
    }

}