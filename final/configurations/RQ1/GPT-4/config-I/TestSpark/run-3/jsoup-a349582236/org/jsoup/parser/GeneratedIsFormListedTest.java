package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class GeneratedIsFormListedTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void isFormListedTest() {
        Tag buttonTag = Tag.valueOf("button");
        assertTrue(buttonTag.isFormListed());
    }

}