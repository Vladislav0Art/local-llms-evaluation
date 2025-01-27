package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveAttributes {

    @Test
    public void removeAttributes() {
        Safelist basic = Safelist.basic();
        Safelist noClass = Safelist.removeAttributes(basic, "class");
        assertNull(noClass.getEnforcedAttributes("div").getValue("class"));
    }

}