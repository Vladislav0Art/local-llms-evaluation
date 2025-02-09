package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.mockito.Mockito;

public class GeneratedNone_SafeList_ReturnsNone {

    @Test
    public void none_SafeList_ReturnsNone() {
        Safelist result = Safelist.none();
        assertNotNull(result);
        assertTrue(Safelist.NONE.contains("img"));
    }

}