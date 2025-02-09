package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFormatAsBlock_BlockTagReturnTrue {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void formatAsBlock_BlockTagReturnTrue() {
        boolean formatted = true;
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
        assertTrue(tag.formatAsBlock(formatted));
    }

}