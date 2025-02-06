package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedFormatAsBlock_FragmentTag_ReturnsFalse {

    @Test
    public void formatAsBlock_FragmentTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.formatAsBlock());
    }

}