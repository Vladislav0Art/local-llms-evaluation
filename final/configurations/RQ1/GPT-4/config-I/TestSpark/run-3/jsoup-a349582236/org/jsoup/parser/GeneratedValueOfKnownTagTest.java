package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class GeneratedValueOfKnownTagTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void valueOfKnownTagTest() {
        Tag pTag = Tag.valueOf("P"); // predefined tag
        assertEquals("P", pTag.getName());
    }

}