package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveProtocols_RemovesFromEnforcedAttributes {

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
    public void removeProtocols_RemovesFromEnforcedAttributes() {
        Safelist safelist = new Safelist();
        Map<String, String> enforcedAttributes = new HashMap<>();
        safelist.addProtocols("img", "src", "http://example.com");
        safelist.removeProtocols("img", "src", "http://example2.com");
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}