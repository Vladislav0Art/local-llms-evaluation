package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedIsSafeTag {

    @Test
    public void isSafeTag() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        assertTrue(basicWithImg.isSafeTag("img"));
    }

}