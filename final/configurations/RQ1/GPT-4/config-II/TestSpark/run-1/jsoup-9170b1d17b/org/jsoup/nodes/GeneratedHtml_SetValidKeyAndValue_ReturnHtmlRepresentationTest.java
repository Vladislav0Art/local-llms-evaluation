package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedHtml_SetValidKeyAndValue_ReturnHtmlRepresentationTest {

    @Test
    public void html_SetValidKeyAndValue_ReturnHtmlRepresentationTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        String html = instance.html();
        assertEquals("test=\"value\"", html);
    }

}