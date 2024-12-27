package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals ReturnsEqualsForEqualTags {

    @Mock
    private ParseSettings settings;

    @Test
    public void equals

    ReturnsEqualsForEqualTags() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        Mockito.when(tag1.getName()).thenReturn("tag");
        Mockito.when(tag2.getName()).thenReturn("tag");
        boolean actual = org.junit.Assert.assertTrue(Tag.equals(tag1, tag2));
    }

}