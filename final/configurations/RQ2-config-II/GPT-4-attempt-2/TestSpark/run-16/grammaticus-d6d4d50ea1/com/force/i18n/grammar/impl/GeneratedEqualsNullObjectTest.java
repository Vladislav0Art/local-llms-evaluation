package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedEqualsNullObjectTest {

    @Test
    public void EqualsNullObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.equals(null));
    }

}