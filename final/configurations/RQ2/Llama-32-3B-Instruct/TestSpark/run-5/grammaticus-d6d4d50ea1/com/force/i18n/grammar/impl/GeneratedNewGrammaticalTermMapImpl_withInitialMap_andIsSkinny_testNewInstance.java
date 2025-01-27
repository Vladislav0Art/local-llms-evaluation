package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewGrammaticalTermMapImpl_withInitialMap_andIsSkinny_testNewInstance {

    @Test
    public void newGrammaticalTermMapImpl_withInitialMap_andIsSkinny_testNewInstance() {
        Map<String, GrammaticalTerm> initialMap = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(initialMap, true);
        assertNotNull(map);
    }

}