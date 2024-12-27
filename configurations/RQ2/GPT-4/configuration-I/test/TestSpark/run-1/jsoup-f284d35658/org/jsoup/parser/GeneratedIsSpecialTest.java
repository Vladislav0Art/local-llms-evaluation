package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedIsSpecialTest {

    @Test
    public void isSpecialTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Element element = new Element("p");

        boolean isSpecial = htmlTreeBuilder.isSpecial(element);
        assertFalse(isSpecial);   // "p" element is not special
    }

}