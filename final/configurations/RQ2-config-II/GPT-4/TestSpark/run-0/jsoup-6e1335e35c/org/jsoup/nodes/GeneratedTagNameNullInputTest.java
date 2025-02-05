package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedTagNameNullInputTest {

    @Test
    public void tagNameNullInputTest() {
        new Element(Tag.valueOf(""), "").tagName(null);
    }

}