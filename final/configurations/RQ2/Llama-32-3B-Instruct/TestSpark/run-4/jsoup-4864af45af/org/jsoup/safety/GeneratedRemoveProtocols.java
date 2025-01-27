package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveProtocols {

    @Test
    public void removeProtocols() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        Safelist noOnLoad = Safelist.removeProtocols(basicWithImg, "onload", new String[]{"http-only"});
        assertNull(noOnLoad.getEnforcedAttributes("img").getValue("onload"));
    }

}