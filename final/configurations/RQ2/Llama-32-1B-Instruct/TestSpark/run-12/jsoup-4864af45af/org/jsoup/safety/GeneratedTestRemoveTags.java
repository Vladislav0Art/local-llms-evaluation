package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestRemoveTags {

    @Test
    public void testRemoveTags() {
        Safelist safelist = new Safelist().simpleText();
        safelist.removeTags("p", "a");
        assertFalse(Safelist.simpleText().isSafeTag("p"));
    }

}