package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestReturnsFalseForUnequalTags {

    @Test
    public void testReturnsFalseForUnequalTags() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        Mockito.when(tag1.getName()).thenReturn("tag");
        Mockito.when(tag2.getName()).thenReturn("otherTag");
        boolean actual = org.junit.Assert.assertFalse(Tag.equals(tag1, tag2));
    }

}