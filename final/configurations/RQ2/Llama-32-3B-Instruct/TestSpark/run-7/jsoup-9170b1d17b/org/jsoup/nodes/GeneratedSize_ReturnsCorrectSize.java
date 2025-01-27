package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

public class GeneratedSize_ReturnsCorrectSize {

    @Test
    public void size_ReturnsCorrectSize() {
        Attributes attrs = new Attributes();
        Attribute attr1 = new Attribute("test1", "value1");
        Attribute attr2 = new Attribute("test2", "value2");
        attrs.add(attr1.getKey(), attr1.getValue());
        attrs.add(attr2.getKey(), attr2.getValue());
        assertEquals(2, attrs.size());
    }

}