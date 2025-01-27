package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedRemoveProtocols {

    @Test
    public void removeProtocols() {
        Safelist safelist = Safelist.addProtocols("img", "src")
                .removeProtocols();
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}