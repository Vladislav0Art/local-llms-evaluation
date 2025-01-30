package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attr1 = new Attributes();
        attr1.put("Key1", "Value1");
        attr1.put("Key2", "Value2");
        Attributes attr2 = new Attributes();
        attr2.put("Key3", "Value3");
        attr2.put("Key4", "Value4");
        attr1.addAll(attr2);
        assertEquals(4, attr1.size());
    }

}