package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveProtocols_RemovesNewlyAddedProtocolsFromSafelistTest {

    @Test
    public void removeProtocols_RemovesNewlyAddedProtocolsFromSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.removeProtocols("img", "data-src");
        assertNull((Attribute) new Attributes().add("data-src"));
    }

}