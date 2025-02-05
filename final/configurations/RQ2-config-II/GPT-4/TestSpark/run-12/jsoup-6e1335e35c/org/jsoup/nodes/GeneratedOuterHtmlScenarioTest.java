package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlScenarioTest {

    @Test
    public void outerHtmlScenarioTest() {
        Element element = new Element("div");
        Tag tag = element.tag();

        assertEquals("<div></div>", tag.toString());
    }

}