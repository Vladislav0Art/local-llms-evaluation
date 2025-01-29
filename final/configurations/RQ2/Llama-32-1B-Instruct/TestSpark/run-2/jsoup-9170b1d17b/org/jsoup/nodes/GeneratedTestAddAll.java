package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.jsoup.nodes.Attributes.checkNotNull;
import static org.mockito.Mockito.*;

public class GeneratedTestAddAll {

    private String key;
    private Object value;

    @Test
    public void testAddAll() {
        Attributes attrs = new Attributes();
        Attr attr1 = new Attr("attr1", "value1");
        Attr attr2 = new Attr("attr2", "value2");

        attrs.addAll(Arrays.asList(attr1, attr2));

        assertEquals(2, attrs.size());
        verify(add, times(2)).add(key, value);
    }

}