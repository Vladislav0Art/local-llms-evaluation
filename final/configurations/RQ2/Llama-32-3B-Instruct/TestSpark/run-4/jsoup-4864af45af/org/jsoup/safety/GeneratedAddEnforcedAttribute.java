package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddEnforcedAttribute {

    @Test
    public void addEnforcedAttribute() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        Safelist withStyle = Safelist.addEnforcedAttribute(basicWithImg, "style", "color: red;");
        assertEquals("color: red;", ((Attributes) withStyle.getEnforcedAttributes("img")).getValue("style"));
    }

}