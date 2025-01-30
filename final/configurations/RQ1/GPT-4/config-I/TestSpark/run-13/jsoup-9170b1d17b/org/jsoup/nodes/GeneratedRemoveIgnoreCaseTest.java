package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        attr.removeIgnoreCase("KEY");
        assertFalse(attr.hasKey("Key"));
    }

}