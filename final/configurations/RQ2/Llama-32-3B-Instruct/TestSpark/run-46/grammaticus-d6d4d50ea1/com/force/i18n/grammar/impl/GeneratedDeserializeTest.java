package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedDeserializeTest {

    @Test
    public void deserializeTest() {
        GrammaticalTermMapImpl<T> gtm1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> gtm2 = MapSerializer.deserialize(gtm1); // assuming readObject implementation exists
        assertTrue(gtm1.equals(gtm2));
    }
}

}