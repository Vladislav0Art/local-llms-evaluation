package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedRemoveProtocols_RemovedProtocolsAreDisallowed {

    @Test
    public void removeProtocols_RemovedProtocolsAreDisallowed() {
        Safelist safelist = Safelist.addProtocols("script", "src", "https://example.com", "http://example.net").removeProtocols("script", "src", "http://example.net");
        assertFalse(safelist.getEnforcedAttributes("script").containsKey("src"));
    }

}