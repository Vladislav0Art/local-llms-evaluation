package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock tagWithBlockAttribute tagWithoutBlockAttribute_ReturnsTrue {

    @Test
    public void formatAsBlock

    tagWithBlockAttribute tagWithoutBlockAttribute_ReturnsTrue() {
        String tagName = "pre";
        Tag actualTag = Tag.valueOf(tagName);
        assertTrue(actualTag.formatAsBlock());
    }

}