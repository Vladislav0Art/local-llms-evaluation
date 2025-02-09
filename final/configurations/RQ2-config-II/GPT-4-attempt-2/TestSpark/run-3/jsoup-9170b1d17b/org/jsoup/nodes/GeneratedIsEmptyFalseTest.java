package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.jsoup.nodes.Attributes.*;

public class GeneratedIsEmptyFalseTest {

    @Test
    public void isEmptyFalseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertFalse(attributes.isEmpty());
    }

}