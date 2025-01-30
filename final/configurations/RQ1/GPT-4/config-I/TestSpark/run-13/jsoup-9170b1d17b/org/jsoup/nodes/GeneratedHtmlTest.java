package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        assertEquals(" Key=\"Value\"", attr.html());
    }

}