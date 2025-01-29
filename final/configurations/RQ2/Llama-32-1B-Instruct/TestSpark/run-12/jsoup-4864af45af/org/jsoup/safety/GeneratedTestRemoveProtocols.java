package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestRemoveProtocols {

    @Test
    public void testRemoveProtocols() {
        Safelist safelist = new Safelist().basicWithImages();
        safelist.removeProtocols("img", "alt");
        assertFalse(Safelist.basicWithImages().isSafeTag("img-alt"));
    }

}