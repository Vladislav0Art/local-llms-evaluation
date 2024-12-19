package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToString_EmptyTag_ReturnsEmptyString {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void toString_EmptyTag_ReturnsEmptyString() {
        String name = "input";
        Tag result = new Tag(name);
        String actual = result.toString();
        org.junit.Assert.assertEquals("", actual);
    }

}