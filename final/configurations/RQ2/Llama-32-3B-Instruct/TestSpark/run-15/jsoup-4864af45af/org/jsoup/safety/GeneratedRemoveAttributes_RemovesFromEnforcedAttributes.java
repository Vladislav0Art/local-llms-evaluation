package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveAttributes_RemovesFromEnforcedAttributes {

    @Mock
    private Set<String> setOfTags;

    @Mock
    private Iterator<String> iteratorOfTags;

    public Safelist none() {
        return new Safelist();
    }

    public static final String BASIC_TAG = "basic";
    public static final String SIMPLE_TEXT_TAG = "simpleText";

    @Test
    public void removeAttributes_RemovesFromEnforcedAttributes() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("img", "src", "url");
        safelist.removeAttributes("img", "src");
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}