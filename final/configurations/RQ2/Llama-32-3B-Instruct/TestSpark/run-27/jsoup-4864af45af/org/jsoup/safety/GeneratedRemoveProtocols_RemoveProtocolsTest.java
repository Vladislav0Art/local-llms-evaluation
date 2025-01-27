package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveProtocols_RemoveProtocolsTest {

    @Test
    public void removeProtocols_RemoveProtocolsTest() {
        Safelist safelist = Safelist.removeProtocols("img", "alt", new String[]{"https://example.com"});
        assertFalse(safelist.getEnforcedAttributes("img").contains(new Attribute("alt", "text")));
    }

}