package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GeneratedTestTagNormalName {

    public static String normalName(String tagName) {
        return tagName;
    }

    public boolean isBlock(String tagName) {
        return tagName.equals("block");
    }

    public boolean isInline(String tagName) {
        return tagName.equals("inline");
    }

    public boolean isSelfClosing(String tagName) {
        return tagName.equals("self-closing");
    }
}

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testTagNormalName() {
        Document document = new org.jsoup.nodes.Document();
        Element element = document.createElement("div");
        assertEquals("div", Tag.normalName(element.tagName()));
    }

}