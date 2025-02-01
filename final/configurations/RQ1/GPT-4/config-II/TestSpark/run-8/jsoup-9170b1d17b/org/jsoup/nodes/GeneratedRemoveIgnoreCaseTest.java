package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.removeIgnoreCase("KEY");

        assertFalse(attributes.hasKey("key"));
    }

}