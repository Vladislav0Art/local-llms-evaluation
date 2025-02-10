package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedEqualsWithDifferentObjectTest {

    @Test
    public void equalsWithDifferentObjectTest() {
        GrammaticalTermMapImpl<T> gtm1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> gtm2 = new GrammaticalTermMapImpl<>();
        assertFalse(gtm1.equals(gtm2));
    }

}