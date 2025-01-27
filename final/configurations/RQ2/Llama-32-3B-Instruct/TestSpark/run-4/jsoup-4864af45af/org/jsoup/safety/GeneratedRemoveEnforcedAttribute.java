package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveEnforcedAttribute {

    @Test
    public void removeEnforcedAttribute() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        Safelist noStyle = Safelist.removeEnforcedAttribute(basicWithImg, "style");
        assertNull(noStyle.getEnforcedAttributes("img").getValue("style"));
    }

}