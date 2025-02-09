package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.mockito.Mockito;

public class GeneratedBasic_BasicTagsAndImagesReturnTrue {

    @Test
    public void basic_BasicTagsAndImagesReturnTrue() {
        Safelist result = new Safelist();
        result.addSafeTag("p");
        result.addSafeTag("img");
        assertTrue(result.isSafeTag("p"));
        assertTrue(result.isSafeTag("img"));
    }

}