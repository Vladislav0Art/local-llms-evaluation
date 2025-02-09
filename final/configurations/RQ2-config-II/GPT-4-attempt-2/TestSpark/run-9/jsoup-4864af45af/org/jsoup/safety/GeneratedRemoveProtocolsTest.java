package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", null, null));
    }

}