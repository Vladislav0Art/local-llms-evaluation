package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsEmpty_EmptyTag_ReturnsTrue {

    @Mock
    private ParseSettings parseSettings;

    @InjectMocks
    private Tag tag;

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        tag.setName("");
        boolean result = tag.isEmpty();
        org.junit.Assert.assertTrue(result);
    }

}