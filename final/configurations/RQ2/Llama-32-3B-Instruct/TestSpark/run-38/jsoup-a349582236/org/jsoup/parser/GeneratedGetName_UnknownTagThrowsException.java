package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_UnknownTagThrowsException {

    @Test
    public void getName_UnknownTagThrowsException() {
        assertTrue(Tag.class.isAssignableFrom(EmptyTag.class));
        EmptyTag emptyTag = (EmptyTag) Tag.valueOf("");
        assertNull(emptyTag.getName());
    }

}