package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalName_EmptyName_ReturnsLowercaseName {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void normalName_EmptyName_ReturnsLowercaseName() {
        String name = "abc";
        tag.setName(name);
        String result = tag.normalName();
        org.junit.Assert.assertEquals("abc", result.toLowerCase());
    }

}