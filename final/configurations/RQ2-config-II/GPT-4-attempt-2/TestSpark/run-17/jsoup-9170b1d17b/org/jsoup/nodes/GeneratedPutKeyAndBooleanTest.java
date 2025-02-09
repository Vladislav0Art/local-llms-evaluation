package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.*;

public class GeneratedPutKeyAndBooleanTest {

    @Test
    public void putKeyAndBooleanTest() {
        Attributes attributes = new Attributes();
        Attributes result = attributes.put("key", true);
        assertTrue(result.hasKey("key"));
    }

}