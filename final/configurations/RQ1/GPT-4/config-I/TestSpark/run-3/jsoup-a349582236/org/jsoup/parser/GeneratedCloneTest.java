package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class GeneratedCloneTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void cloneTest() {
        Tag originTag = Tag.valueOf("origin");
        Tag cloneTag = originTag.clone();
        assertNotSame(originTag, cloneTag);
        assertEquals(originTag, cloneTag);
    }

}