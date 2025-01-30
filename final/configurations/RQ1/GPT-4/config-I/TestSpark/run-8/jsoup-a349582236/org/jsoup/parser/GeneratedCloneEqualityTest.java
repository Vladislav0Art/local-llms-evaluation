package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneEqualityTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void cloneEqualityTest() throws Exception {
        Tag original = Tag.valueOf("p");
        Tag cloned = original.clone();
        assertEquals(original, cloned);
    }

}