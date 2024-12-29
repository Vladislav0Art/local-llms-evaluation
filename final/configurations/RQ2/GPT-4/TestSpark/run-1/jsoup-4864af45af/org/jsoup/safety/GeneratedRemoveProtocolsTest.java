package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.removeProtocols("a", "href", "http");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertEquals(1, attributes.size());
    }

}