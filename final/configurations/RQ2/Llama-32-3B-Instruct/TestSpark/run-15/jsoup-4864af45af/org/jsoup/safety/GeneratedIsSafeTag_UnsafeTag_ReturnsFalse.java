package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeTag_UnsafeTag_ReturnsFalse {

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
    public void isSafeTag_UnsafeTag_ReturnsFalse() {
        when(setOfTags).not().contains("unsafe");
        assertFalse(Safelist.none().isSafeTag("unsafe"));
    }

}