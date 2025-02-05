package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAttrScenarioTest {

    @Test
    public void attrScenarioTest() {
        Element element = new Element("p");
        element.attr("class", "text-content");
        assertEquals("text-content", element.attr("class"));
    }

}