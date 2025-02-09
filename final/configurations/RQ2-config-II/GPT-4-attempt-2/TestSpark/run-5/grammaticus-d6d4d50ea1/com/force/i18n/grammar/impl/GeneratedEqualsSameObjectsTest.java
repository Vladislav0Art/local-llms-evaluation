package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedEqualsSameObjectsTest {

    @Test
    public void equalsSameObjectsTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.equals(map));
    }

}