package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void none_Safe() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void simpleText_SimpleTagsSafe() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeTag("iframe"));
    }

    @Test
    public void simpleText_NonSafeTags() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.isSafeTag("javascript"));
    }

    @Test
    public void addProtocols_SafeProtocolsAdded() {
        Safelist safelist = Safelist.none();
        String protocolToAdd = "https";
        safelist.addProtocol("img", "src", protocolToAdd);
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void addProtocols_SafeProtocolsNotAdded() {
        Safelist safelist = Safelist.none();
        String protocolToAdd = "https";
        safelist.addProtocol("img", "src", protocolToAdd);
        assertTrue(safelist.getEnforcedAttributes("script").containsKey("src"));
    }

    @Test
    public void removeProtocols_SafeProtocolsRemoved() {
        Safelist safelist = Safelist.none();
        String protocolToRemove = "https";
        safelist.removeProtocol("img", "src", protocolToRemove);
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void preserveRelativeLinks_Preserve() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.preserveRelativeLinks());
    }

    @Test
    public void preserveRelativeLinks_DoNotPreserve() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.preserveRelativeLinks());
    }

}