package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedAddProtocols_addsProtocolsForTag {

    @Test
    public void addProtocols_addsProtocolsForTag() {
        Safelist safelist = Safelist.relaxed().addProtocols("a", "href", "http", "https");
        assertNotNull(safelist);
        assertEquals(2, ((Set<String>) safelist.getEnforcedAttributes("a")).size());
    }

}