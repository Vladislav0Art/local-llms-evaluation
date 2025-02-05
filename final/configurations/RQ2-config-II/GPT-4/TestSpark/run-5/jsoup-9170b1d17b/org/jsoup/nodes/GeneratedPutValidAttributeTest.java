package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedPutValidAttributeTest {

    @Test
    public void putValidAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("id", "1");
        assertEquals("1", attributes.get("id"));
    }

}