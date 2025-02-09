package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedRelaxed_AddAttributes_DoesNotAdd {

    @Test
    public void relaxed_AddAttributes_DoesNotAdd() {
        Safelist safelist = Safelist.relaxed().addAttributes("img", "alt");
        Attributes addedAttributes = safelist.getEnforcedAttributes("img");
        assertTrue(addedAttributes == null || addedAttributes.size() == 0);
    }

}