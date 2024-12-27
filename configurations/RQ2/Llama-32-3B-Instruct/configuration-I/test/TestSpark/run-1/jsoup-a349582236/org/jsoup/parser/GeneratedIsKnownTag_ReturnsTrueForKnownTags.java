package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsKnownTag_ReturnsTrueForKnownTags {

    @Mock
    private ParseSettings settings;

    @Test
    public void isKnownTag_ReturnsTrueForKnownTags() {
        String tagName = "img";
        Tag expected = new Tag();
        org.junit.Assert.assertTrue(Tag.isKnownTag(tagName));
    }

}