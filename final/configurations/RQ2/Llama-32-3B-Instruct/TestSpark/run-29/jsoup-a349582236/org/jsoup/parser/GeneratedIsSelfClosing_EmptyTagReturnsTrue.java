package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_EmptyTagReturnsTrue {

    @Test
    public void isSelfClosing_EmptyTagReturnsTrue() {
        assertTrue(Tag.valueOf("").isSelfClosing());
    }

}