package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestWriteJson {

    @Test
    public void testWriteJson() {
        MockGrammaticalTermMap write = new MockGrammaticalTermMap();
        String json = write.writeJson(System.out, null, null, Collections.emptyList());
        assertEquals("[{\"string\":\"string\",\"number\":1,\"data\":[\"string\",\"string\",\"number\":2,\"data\":[\"string\",\"string\"]},{\"string\":\"string\",\"number\":3,\"data\":[\"string\",\"string\"]},{\"string\":\"string\",\"number\":4,\"data\":[\"string\",\"string\"]}]", json);
    }

}