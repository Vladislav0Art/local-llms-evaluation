package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedClone_ReturnsSameInstance {

    @Test
    public void clone_ReturnsSameInstance() {
        Tag tag = new Tag();
        Tag clonedTag = tag.clone();
        AssertTrue.assertTrue(clonedTag == tag);
    }

}