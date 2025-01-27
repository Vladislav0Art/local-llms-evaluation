package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_EmptyTagReturnsFalse {

    @Test
    public void isSelfClosing_EmptyTagReturnsFalse() {
        assertFalse(Tag.valueOf("").isSelfClosing()); // Changed to False
    }

}