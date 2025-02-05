package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Attribute attribute = new Attribute("class", "someClass");
        Element element = new Element("div").attr("class", "someClass");
        Safelist safelist = new Safelist();

        assertFalse(safelist.isSafeAttribute("script", element, attribute));
    }

}