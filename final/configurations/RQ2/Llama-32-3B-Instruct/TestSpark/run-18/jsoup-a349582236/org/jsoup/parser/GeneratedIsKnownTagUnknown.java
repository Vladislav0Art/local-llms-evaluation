package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTagUnknown {

    @Test
    public void isKnownTagUnknown() {
        Tag unknownTag = new Tag();
        unknownTag.setName("unknown");
        assertFalse(unknownTag.isKnownTag());
    }

}