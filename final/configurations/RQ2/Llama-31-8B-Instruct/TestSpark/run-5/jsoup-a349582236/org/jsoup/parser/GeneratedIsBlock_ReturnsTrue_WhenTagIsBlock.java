package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlock_ReturnsTrue_WhenTagIsBlock {

    @Test
    public void isBlock_ReturnsTrue_WhenTagIsBlock() {
        Tag tag = new TagImpl("p");
        assertTrue(tag.isBlock());
    }

}