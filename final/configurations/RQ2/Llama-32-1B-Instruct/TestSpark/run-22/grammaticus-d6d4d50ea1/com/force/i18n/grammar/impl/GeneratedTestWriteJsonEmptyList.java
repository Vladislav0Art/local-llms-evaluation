package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestWriteJsonEmptyList {

    @Test
    public void testWriteJsonEmptyList() {
        MockGrammaticalTermMap write = new MockGrammaticalTermMap();
        String json = write.writeJson(System.out, null, null, Collections.emptyList());
        assertEquals("[[]]", json);
    }

}