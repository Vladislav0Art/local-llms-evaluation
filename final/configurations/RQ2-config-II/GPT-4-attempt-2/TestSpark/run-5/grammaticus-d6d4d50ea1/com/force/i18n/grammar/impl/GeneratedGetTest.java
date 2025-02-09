package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertNull(map.get("Unknown"));
    }

}