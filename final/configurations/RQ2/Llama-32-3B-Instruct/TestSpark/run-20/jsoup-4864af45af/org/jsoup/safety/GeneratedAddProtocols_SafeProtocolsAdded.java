package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddProtocols_SafeProtocolsAdded {

    @Test
    public void addProtocols_SafeProtocolsAdded() {
        Safelist safelist = Safelist.none();
        String protocolToAdd = "https";
        safelist.addProtocol("img", "src", protocolToAdd);
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}