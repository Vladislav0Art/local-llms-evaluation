package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamConverter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedNewImpl_withInitialTerms_test {

    @Test
    public void newImpl_withInitialTerms_test() {
        Map<String, T> initialTerms = new HashMap<>();
        GrammaticalTerm term1 = mock(T.class);
        GrammaticalTerm term2 = mock(T.class);
        initialTerms.put("term1", term1);
        initialTerms.put("term2", term2);

        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(initialTerms, false);
        assertEquals(2, map.keySet().size());
    }

}