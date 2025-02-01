package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("KEY", "value");
        attributes.normalize();

        assertEquals("value", attributes.get("KEY"));
    }

}