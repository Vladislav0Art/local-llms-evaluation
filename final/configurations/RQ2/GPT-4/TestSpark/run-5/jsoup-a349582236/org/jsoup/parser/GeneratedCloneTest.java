package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag firstTag = Tag.valueOf("p");
        Tag clonedTag = firstTag.clone();
        assertTrue(firstTag.equals(clonedTag));
    }

}