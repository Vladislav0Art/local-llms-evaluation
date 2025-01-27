package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedAddProtocols_AddedProtocolToRelaxedSafelist {

    @Test
    public void addProtocols_AddedProtocolToRelaxedSafelist() {
        Safelist safelist = Safelist.relaxed();
        safelist = safelist.addProtocols("img", Validate.ATTR_SRC, "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("img").containsKey(Validate.ATTR_SRC));
    }

}