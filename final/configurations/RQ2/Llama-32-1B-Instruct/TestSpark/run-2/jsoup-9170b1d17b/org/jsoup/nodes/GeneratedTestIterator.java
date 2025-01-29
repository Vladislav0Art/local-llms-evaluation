package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestIterator {

    private String key;
    private Object value;

    @Test
    public void testIterator() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attr attr = new Attr("attr", "value");

        List<Attribute> list = attrs.asList();

        assertEquals(2, list.size());
        verify(iterator, times(1)).iterator().next();
        verify(iterator, times(1)).iterator().hasNext();
    }

}