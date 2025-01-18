package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedContainsKeyFalseTest {

    @Test
    public void containsKeyFalseTest() {
        String testKey = "test";
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.containsKey(testKey));
    }

}