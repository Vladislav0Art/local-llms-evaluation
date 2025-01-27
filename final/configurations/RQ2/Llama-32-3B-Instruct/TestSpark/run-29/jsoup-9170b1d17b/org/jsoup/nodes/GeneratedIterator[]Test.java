package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedIterator[]

Test {

    @Test
    public void iterator[] Test() {
        Attributes attributes = new Attributes();
        for (int i = 0; i < 10; i++) {
            attributes.put("test-" + i, "value");
        }
        Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

}