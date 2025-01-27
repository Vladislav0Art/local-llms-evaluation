package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeneratedClone_ReturnsNewTagWithSameState {

    @Test
    public void clone_ReturnsNewTagWithSameState() {
        String tagName = "p";
        ParseSettings settings = new ParseSettings();
        Tag originalTag = Tag.valueOf(tagName, settings);
        Tag clonedTag = originalTag.clone();
        assertEquals(originalTag.getName(), clonedTag.getName());
    }

}