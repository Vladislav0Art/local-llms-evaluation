package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedRemoveProtocolsNotSafe {

    @Test
    public void removeProtocolsNotSafe() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("img", "src", "https://example.com");
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute("src", "https://example.com")));
    }

}