package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.mockito.Mockito;

public class GeneratedRelaxed_RelaxedTagsReturnTrue {

    @Test
    public void relaxed_RelaxedTagsReturnTrue() {
        Safelist result = new Safelist();
        result.relaxedTags().add("div");
        result.relaxedAttributes().add(Mockito.mock(Attribute.class));
        assertTrue(result.isSafeTag("div"));
        assertTrue(Safelist.RELAXED_ATTRS.contains("href"));
    }

}