package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf_NonEmptyTagName_ReturnsKnownTagOrGenericTag {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void valueOf_NonEmptyTagName_ReturnsKnownTagOrGenericTag() {
        String tagName = "p";
        Tag result = Tag.valueOf(tagName, parseSettings);
        org.junit.Assert.assertNotNull(result);
    }

}