package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_EmptyTag_ReturnsFalse {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void equals_EmptyTag_ReturnsFalse() {
        String name = "input";
        Tag result = new Tag(name);
        boolean actual = tag.equals(result);
        org.junit.Assert.assertFalse(actual);
    }

}