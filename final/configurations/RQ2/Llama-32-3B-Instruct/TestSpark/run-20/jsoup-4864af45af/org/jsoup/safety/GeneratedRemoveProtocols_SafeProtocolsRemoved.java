package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveProtocols_SafeProtocolsRemoved {

    @Test
    public void removeProtocols_SafeProtocolsRemoved() {
        Safelist safelist = Safelist.none();
        String protocolToRemove = "https";
        safelist.removeProtocol("img", "src", protocolToRemove);
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}