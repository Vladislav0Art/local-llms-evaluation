package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSerializeAndDeserializeTest {

    @Test
    public void serializeAndDeserializeTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        // setup test data
        GrammaticalTerm term = new GrammaticalTerm();
        map.put("key", term);
        String json = MapSerializer.serialize(map);
        GrammaticalTermMapImpl<T> gtm = new GrammaticalTermMapImpl<>(json, true); // assuming readObject implementation exists
        assertEquals(map, gtm);
    }

}