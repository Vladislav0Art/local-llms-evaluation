package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFormatAsBlock_ReturnsTrueForBlockTags {

    @Mock
    private ParseSettings settings;

    @Test
    public void formatAsBlock_ReturnsTrueForBlockTags() {
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn("p");
        boolean actual = tag.formatAsBlock();
        org.junit.Assert.assertTrue(actual);
    }

}