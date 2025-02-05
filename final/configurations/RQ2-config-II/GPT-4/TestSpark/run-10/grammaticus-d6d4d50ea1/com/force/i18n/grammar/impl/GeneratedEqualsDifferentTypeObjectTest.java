package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedEqualsDifferentTypeObjectTest {

    @Test
    public void equalsDifferentTypeObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        assertFalse(map1.equals(new Object()));
    }

}