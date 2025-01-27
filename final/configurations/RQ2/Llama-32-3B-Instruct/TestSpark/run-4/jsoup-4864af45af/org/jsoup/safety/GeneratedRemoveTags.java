package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveTags {

    @Test
    public void removeTags() {
        Safelist basic = Safelist.basic();
        Safelist noImg = Safelist.removeTags(basic, "img");
        assertFalse(noImg.isSafeTag("img"));
    }

}