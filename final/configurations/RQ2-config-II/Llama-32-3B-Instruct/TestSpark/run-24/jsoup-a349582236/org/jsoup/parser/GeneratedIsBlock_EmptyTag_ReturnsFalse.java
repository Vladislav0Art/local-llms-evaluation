package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_EmptyTag_ReturnsFalse {

    @Test
    public void isBlock_EmptyTag_ReturnsFalse() {
        boolean isBlock = Tag.valueOf("").isBlock();
        assertFalse(isBlock);
    }

}