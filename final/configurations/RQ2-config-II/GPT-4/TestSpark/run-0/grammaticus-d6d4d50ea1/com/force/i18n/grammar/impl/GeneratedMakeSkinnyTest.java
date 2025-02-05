package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertNotNull(map.makeSkinny());
    }

}