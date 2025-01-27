package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GeneratedRemoveProtocols_RemoveAddedProtocolFromRelaxedSafelist {

    @Test
    public void removeProtocols_RemoveAddedProtocolFromRelaxedSafelist() {
        Safelist safelist = Safelist.relaxed();
        safelist = safelist.addProtocols("img", Validate.ATTR_SRC, "https://example.com");
        safelist = safelist.removeProtocols("img", Validate.ATTR_SRC, new String[]{"https://example.net"});
        assertTrue(safelist.getEnforcedAttributes("img").isEmpty());
    }

}