package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedAddProtocolsTest {

    //Testing null variables during instantiation

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.addProtocols("a", "href", "http");
        assertNotNull(safelist);
    }

}