package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

}