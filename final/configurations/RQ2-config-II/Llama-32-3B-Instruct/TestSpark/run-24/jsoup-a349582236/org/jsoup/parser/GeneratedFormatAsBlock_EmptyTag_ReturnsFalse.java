package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_EmptyTag_ReturnsFalse {

    @Test
    public void formatAsBlock_EmptyTag_ReturnsFalse() {
        boolean formatAsBlock = Tag.valueOf("").formatAsBlock();
        assertFalse(formatAsBlock);
    }

}