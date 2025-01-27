package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTags_AddsToSetOfTags {

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
    public void addTags_AddsToSetOfTags() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        assertTrue(setOfTags.contains("tag1") && setOfTags.contains("tag2"));
    }

}