package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddProtocols_AddProtocolsTest {

    @Test
    public void addProtocols_AddProtocolsTest() {
        Safelist safelist = Safelist.addProtocols("img", "alt", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("img").contains(new Attribute("alt", "text")));
    }

}