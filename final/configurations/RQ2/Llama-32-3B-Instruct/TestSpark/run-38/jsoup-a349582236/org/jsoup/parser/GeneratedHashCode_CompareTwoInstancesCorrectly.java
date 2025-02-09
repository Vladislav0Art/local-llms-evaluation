package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCode_CompareTwoInstancesCorrectly {

    @Test
    public void hashCode_CompareTwoInstancesCorrectly() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertNotEquals(tag1, tag2);
        assertTrue(tag1.hashCode() == tag2.hashCode());
    }

}