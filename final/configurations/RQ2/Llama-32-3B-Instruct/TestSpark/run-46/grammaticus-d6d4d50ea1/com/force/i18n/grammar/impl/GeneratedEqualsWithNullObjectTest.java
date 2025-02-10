package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedEqualsWithNullObjectTest {

    @Test
    public void equalsWithNullObjectTest() {
        GrammaticalTermMapImpl<T> gtm1 = new GrammaticalTermMapImpl<>();
        assertFalse(gtm1.equals(null));
    }

}