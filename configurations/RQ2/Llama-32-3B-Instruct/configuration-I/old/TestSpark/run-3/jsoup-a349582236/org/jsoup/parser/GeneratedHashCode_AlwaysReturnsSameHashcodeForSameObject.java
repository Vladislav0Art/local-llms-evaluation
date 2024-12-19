package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCode_AlwaysReturnsSameHashcodeForSameObject {

    @Test
    public void hashCode_AlwaysReturnsSameHashcodeForSameObject() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}