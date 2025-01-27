package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

public class GeneratedIterator_ReturnsIteratorWithKeys {

    @Test
    public void iterator_ReturnsIteratorWithKeys() {
        Attributes attrs = new Attributes();
        Attribute attr1 = new Attribute("test1", "value1");
        Attribute attr2 = new Attribute("test2", "value2");
        attrs.add(attr1.getKey(), attr1.getValue());
        attrs.add(attr2.getKey(), attr2.getValue());
        Iterator<Attribute> iterator = attrs.iterator();
        assertEquals(2, Collections.frequency(Arrays.asList(iterator.next(), iterator.next()), ""));
    }

}