package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOf_EmptyTagName_ReturnsGenericTag {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void valueOf_EmptyTagName_ReturnsGenericTag() {
        Tag result = Tag.valueOf("", parseSettings);
        org.junit.Assert.assertTrue(result instanceof Tag);
    }

}