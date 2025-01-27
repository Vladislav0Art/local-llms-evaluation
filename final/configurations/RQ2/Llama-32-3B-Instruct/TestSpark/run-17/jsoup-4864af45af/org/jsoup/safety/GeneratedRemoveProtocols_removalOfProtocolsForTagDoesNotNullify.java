package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRemoveProtocols_removalOfProtocolsForTagDoesNotNullify {

    @Test
    public void removeProtocols_removalOfProtocolsForTagDoesNotNullify() {
        Safelist safelist = Safelist.addProtocols("img", "src", "http", "https").removeProtocols("img", "src");
        assertNotNull(safelist);
        assertFalse((Set<String>) safelist.getEnforcedAttributes("img"));
    }

}