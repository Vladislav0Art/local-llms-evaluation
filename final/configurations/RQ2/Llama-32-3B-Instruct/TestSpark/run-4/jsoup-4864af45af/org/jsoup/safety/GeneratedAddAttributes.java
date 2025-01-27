package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddAttributes {

    @Test
    public void addAttributes() {
        Safelist basic = Safelist.basic();
        Safelist withClass = Safelist.addAttributes(basic, "class", "foo-bar");
        assertEquals("foo-bar", ((Attributes) withClass.getEnforcedAttributes("div")).getValue("class"));
    }

}