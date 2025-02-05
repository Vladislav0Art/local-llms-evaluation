package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertNull(map.get("key"));
    }

}