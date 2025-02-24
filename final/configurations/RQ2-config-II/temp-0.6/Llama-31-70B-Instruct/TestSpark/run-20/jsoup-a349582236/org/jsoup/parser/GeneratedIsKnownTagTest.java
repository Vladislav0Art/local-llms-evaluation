package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsKnownTagTest {

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag();
        assertFalse(tag.isKnownTag());
    }

}