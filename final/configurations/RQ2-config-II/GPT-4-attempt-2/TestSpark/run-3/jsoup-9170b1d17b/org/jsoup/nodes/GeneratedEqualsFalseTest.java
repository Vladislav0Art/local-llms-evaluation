package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.jsoup.nodes.Attributes.*;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");
        Attributes attributes2 = new Attributes();
        assertFalse(attributes1.equals(attributes2));
    }

}