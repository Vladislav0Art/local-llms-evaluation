package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedEqualsWithSameObjectTest {

    @Test
    public void equalsWithSameObjectTest() {
        GrammaticalTermMapImpl<T> gtm1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> gtm2 = gtm1;
        assertTrue(gtm1.equals(gtm2));
    }

}