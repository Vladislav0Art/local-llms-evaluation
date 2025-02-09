package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedSimpleText_AddProtocols_DoesNotAdd {

    @Test
    public void simpleText_AddProtocols_DoesNotAdd() {
        Safelist safelist = Safelist.simpleText();
        String[] addedProtocols = safelist.getEnforcedAttributes("img").getAttribute("src", new HashSet<>());
        assertTrue(addedProtocols == null || addedProtocols.length == 0);
    }

}