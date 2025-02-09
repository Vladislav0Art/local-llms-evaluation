package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_DifferentTags_ReturnsFalse {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void equals_DifferentTags_ReturnsFalse() {
        String name = "some";
        Tag tag1 = new Tag();
        tag1.setName(name);
        Tag tag2 = new Tag();
        assertEquals(0, tag1.equals(tag2));
    }

}