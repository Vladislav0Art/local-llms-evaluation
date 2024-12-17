package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsKnownTag_KnownTagName_ReturnsTrue {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void isKnownTag_KnownTagName_ReturnsTrue() {
        String tagName = "p";
        boolean result = Tag.isKnownTag(tagName);
        org.junit.Assert.assertTrue(result);
    }

}