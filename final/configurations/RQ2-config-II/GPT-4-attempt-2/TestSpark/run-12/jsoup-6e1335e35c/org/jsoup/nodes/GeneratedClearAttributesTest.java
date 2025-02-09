package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedClearAttributesTest {

    @Test
    public void clearAttributesTest() {
        Element element = new Element("div");
        element.attr("id", "testId");
        element.attr("class", "testClass");
        element.clearAttributes();
        assertTrue(!element.hasAttributes());
    }

}