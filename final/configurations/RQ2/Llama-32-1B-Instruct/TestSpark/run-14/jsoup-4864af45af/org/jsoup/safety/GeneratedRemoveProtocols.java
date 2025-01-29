package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedRemoveProtocols {

    @Test
    public void removeProtocols() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.removeProtocols("a", "#top");
        assertTrue(safelist.getEnforcedAttributes("href"));
    }

}