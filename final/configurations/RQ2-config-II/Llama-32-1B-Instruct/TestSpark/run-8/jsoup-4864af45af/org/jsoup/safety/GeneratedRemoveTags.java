package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedRemoveTags {

    @Test
    public void removeTags() {
        Safelist safelist = new Safelist();
        safelist.removeTags("a");
        assertTrue(safelist.getEnforcedAttributes("").size() > 0);
    }

}