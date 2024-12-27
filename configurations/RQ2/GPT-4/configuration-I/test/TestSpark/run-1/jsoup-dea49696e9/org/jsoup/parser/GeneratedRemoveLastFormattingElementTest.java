package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedRemoveLastFormattingElementTest {

    @Test
    public void removeLastFormattingElementTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element element = new Element(Tag.valueOf("b"), "");
        builder.pushActiveFormattingElements(element);
        assertNotNull(builder.removeLastFormattingElement());
    }

}