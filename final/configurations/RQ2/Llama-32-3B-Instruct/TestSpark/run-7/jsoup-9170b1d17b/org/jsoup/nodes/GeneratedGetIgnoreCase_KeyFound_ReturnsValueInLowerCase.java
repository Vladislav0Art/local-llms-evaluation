package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

public class GeneratedGetIgnoreCase_KeyFound_ReturnsValueInLowerCase {

    @Test
    public void getIgnoreCase_KeyFound_ReturnsValueInLowerCase() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("test", "value");
        attrs.add(attr.getKey(), attr.getValue());
        assertEquals("value", attrs.getIgnoreCase(attr.getKey()));
    }

}