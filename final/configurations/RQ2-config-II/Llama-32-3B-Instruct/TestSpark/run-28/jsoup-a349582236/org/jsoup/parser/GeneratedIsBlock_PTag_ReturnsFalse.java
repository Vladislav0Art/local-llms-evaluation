package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_PTag_ReturnsFalse {

    @Test
    public void isBlock_PTag_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("p");
        assertFalse(tag.isBlock());
    }

}