package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, true);

        assertTrue(grammaticalTermMapImpl.isSkinny());
    }

}