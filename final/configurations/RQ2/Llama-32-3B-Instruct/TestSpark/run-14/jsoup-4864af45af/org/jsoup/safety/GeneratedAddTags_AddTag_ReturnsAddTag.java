package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedAddTags_AddTag_ReturnsAddTag {

    @Test
    public void addTags_AddTag_ReturnsAddTag() {
        Safelist result = Safelist.addTags("b");
        assertTrue(result.getSafeTags().contains("b"));
    }

}