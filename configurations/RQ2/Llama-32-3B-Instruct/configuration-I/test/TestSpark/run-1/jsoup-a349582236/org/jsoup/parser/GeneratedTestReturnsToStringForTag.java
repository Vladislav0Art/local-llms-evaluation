package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestReturnsToStringForTag {

    @Test
    public void testReturnsToStringForTag() {
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("tag");
        String actual = org.junit.Assert.assertEquals(Tag.toString(tag).toString(), "tag");
    }

}