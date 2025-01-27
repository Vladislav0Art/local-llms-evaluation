package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_H1TagReturnsFalse {

    @Test
    public void isBlock_H1TagReturnsFalse() {
        assertFalse(Tag.valueOf("<h1>").isBlock());
    }

}