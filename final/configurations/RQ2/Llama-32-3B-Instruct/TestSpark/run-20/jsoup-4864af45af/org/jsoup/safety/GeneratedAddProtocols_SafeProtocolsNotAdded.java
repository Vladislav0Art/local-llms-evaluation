package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddProtocols_SafeProtocolsNotAdded {

    @Test
    public void addProtocols_SafeProtocolsNotAdded() {
        Safelist safelist = Safelist.none();
        String protocolToAdd = "https";
        safelist.addProtocol("img", "src", protocolToAdd);
        assertTrue(safelist.getEnforcedAttributes("script").containsKey("src"));
    }

}