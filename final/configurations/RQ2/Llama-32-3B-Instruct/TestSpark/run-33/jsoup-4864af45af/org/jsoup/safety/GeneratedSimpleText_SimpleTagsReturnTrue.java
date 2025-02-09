package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.mockito.Mockito;

public class GeneratedSimpleText_SimpleTagsReturnTrue {

    @Test
    public void simpleText_SimpleTagsReturnTrue() {
        Safelist result = new Safelist();
        result.addSafeTag("img");
        result.addSafeTag("br");
        assertTrue(result.isSafeTag("img"));
        assertTrue(result.isSafeTag("br"));
    }

}