package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToString ReturnsToStringForTag {

    @Mock
    private ParseSettings settings;

    @Test
    public void toString

    ReturnsToStringForTag() {
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("tag");
        String actual = org.junit.Assert.assertEquals(Tag.toString(tag).toString(), "tag");
    }

}