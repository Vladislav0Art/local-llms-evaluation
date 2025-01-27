package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPreserveRelativeLinks_PreserveTrue_ReturnsSelf {

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
    public void preserveRelativeLinks_PreserveTrue_ReturnsSelf() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.preserveRelativeLinks(true).equals(safelist));
    }

}