package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddTags {

    @Test
    public void addTags() {
        Safelist basic = Safelist.basic();
        Safelist basicWithImg = Safelist.addTags(basic, "img");
        assertTrue(basicWithImg.isSafeTag("img"));
    }

}