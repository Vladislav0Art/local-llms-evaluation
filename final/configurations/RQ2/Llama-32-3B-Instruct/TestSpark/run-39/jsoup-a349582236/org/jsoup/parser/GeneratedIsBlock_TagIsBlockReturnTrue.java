package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlock_TagIsBlockReturnTrue {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void isBlock_TagIsBlockReturnTrue() {
        boolean block = true;
        Tag tag = new Tag();
        tag.setSelfClosing(false);
        assertTrue(tag.isBlock());
    }

}