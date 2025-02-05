package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedRemoveExistingAttributeTest {

    @Test
    public void removeExistingAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("id", "1");
        attributes.remove("id");
        assertFalse(attributes.hasKey("id"));
    }

}