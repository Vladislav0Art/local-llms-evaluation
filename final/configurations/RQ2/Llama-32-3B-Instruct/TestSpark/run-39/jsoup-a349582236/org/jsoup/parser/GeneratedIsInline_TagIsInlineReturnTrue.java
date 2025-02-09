package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInline_TagIsInlineReturnTrue {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void isInline_TagIsInlineReturnTrue() {
        boolean inline = false;
        Tag tag = new Tag();
        assertFalse(tag.isInline());
        assertTrue(tag.isInline(inline));
    }

}