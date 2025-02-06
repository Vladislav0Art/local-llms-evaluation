package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedIsEmpty_EmptyName_ReturnsTrue {

    @Test
    public void isEmpty_EmptyName_ReturnsTrue() {
        String name = "";
        Tag tag = Tag.valueOf(name);
        assertTrue(tag.isEmpty());
    }

}