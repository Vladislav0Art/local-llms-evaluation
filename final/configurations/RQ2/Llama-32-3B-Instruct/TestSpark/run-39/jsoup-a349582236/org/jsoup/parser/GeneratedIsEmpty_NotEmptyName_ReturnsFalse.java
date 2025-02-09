package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsEmpty_NotEmptyName_ReturnsFalse {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void isEmpty_NotEmptyName_ReturnsFalse() {
        String name = "some";
        assertFalse(Tag.isEmpty(name));
    }

}