package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_TagEqualsSameTagReturnTrue {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void equals_TagEqualsSameTagReturnTrue() {
        String name = "some";
        Tag tag1 = new Tag();
        tag1.setName(name);
        Tag tag2 = new Tag();
        tag2.setName(name);
        assertTrue(tag1.equals(tag2));
    }

}