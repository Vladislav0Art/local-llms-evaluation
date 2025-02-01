package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedSize_Set2ValidKeysAndValues_Return2Test {

    @Test
    public void size_Set2ValidKeysAndValues_Return2Test() {
        Attributes instance = new Attributes();
        instance.put("test1", "value1");
        instance.put("test2", "value2");
        int result = instance.size();
        assertEquals(2, result);
    }

}