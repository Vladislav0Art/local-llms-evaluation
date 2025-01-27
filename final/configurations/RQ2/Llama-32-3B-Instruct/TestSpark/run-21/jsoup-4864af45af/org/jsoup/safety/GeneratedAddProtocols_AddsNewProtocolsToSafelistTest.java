package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddProtocols_AddsNewProtocolsToSafelistTest {

    @Test
    public void addProtocols_AddsNewProtocolsToSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.addProtocols("img", "data-src", "https://example.com");
        assertEquals(1, ((Attribute) new Attributes().add("data-src")).getIntValue());
    }

}