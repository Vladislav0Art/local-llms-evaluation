package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedEquals_DifferentTagObjectsAreNotEqual {

    @Mock
    private ParseSettings settings;

    @Mock
    private Normalizer normalizer;

    public Tag tag = new Tag();

    @BeforeClass
    public static void setUpClass() {
        // Nothing to do
    }

    @Test
    public void equals_DifferentTagObjectsAreNotEqual() {
        Tag otherTag = new Tag();
        assertFalse(tag.equals(otherTag));
    }

}