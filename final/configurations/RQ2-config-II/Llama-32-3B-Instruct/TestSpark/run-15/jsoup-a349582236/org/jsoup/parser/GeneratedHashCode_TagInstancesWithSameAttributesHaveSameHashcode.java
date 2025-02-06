package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCode_TagInstancesWithSameAttributesHaveSameHashcode {

    @Test
    public void hashCode_TagInstancesWithSameAttributesHaveSameHashcode() {
        Tag tag1 = new Tag("div");
        Tag tag2 = new Tag("div");
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}