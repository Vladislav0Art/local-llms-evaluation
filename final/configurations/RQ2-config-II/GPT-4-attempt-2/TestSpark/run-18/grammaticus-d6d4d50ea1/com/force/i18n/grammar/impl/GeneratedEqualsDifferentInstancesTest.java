package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentInstancesTest {

    @Test
    public void equalsDifferentInstancesTest() {
        GrammaticalTermMapImpl<String> firstInstance = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> secondInstance = new GrammaticalTermMapImpl<>();
        assertNotEquals(firstInstance, secondInstance);
    }

}