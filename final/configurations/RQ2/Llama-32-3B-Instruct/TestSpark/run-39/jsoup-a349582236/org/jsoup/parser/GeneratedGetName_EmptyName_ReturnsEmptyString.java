package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetName_EmptyName_ReturnsEmptyString {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void getName_EmptyName_ReturnsEmptyString() {
        String name = "";
        assertEquals(name, new Tag().getName());
    }

}