package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveNonExistAttributeTest {

    @Test
    public void removeNonExistAttributeTest() {
        Attributes attr = new Attributes();
        attr.remove("nonExistKey");
        assertFalse(attr.hasKey("nonExistKey"));
    }

}