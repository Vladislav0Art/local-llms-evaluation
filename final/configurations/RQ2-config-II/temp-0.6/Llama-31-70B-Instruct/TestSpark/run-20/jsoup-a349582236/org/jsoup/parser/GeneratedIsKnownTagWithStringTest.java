package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsKnownTagWithStringTest {

    @Test
    public void isKnownTagWithStringTest() {
        Tag tag = new Tag();
        assertFalse(tag.isKnownTag(""));
    }

}