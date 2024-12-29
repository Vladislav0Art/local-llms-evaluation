package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveProtocolsTest {

    //Testing null variables during instantiation

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.removeProtocols("a", "href", "http");
        assertNotNull(safelist);
    }

}