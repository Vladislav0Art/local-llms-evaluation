package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedIsEmpty_NonEmptyName_ReturnsFalse {

    @Test
    public void isEmpty_NonEmptyName_ReturnsFalse() {
        String name = "div";
        Tag tag = Tag.valueOf(name);
        assertFalse(tag.isEmpty());
    }

}