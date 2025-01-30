package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedRemoveIgnoreCaseAttributeTest {

    @Test
    public void removeIgnoreCaseAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.removeIgnoreCase("key");
        assertFalse(attributes.hasKey("KEY"));
    }

}