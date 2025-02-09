package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_CompareTwoInstancesCorrectly {

    @Test
    public void equals_CompareTwoInstancesCorrectly() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertSame(tag1, tag2);
        tag2.setName("test");
        assertNotEquals(tag1, tag2);
    }

}