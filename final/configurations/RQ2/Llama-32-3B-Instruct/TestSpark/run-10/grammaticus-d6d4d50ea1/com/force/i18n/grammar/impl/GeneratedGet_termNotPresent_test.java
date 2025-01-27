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

public class GeneratedGet_termNotPresent_test {

    @Test
    public void get_termNotPresent_test() {
        Map<String, T> initialTerms = new HashMap<>();
        GrammaticalTerm term1 = mock(T.class);
        GrammaticalTerm term2 = mock(T.class);
        initialTerms.put("term1", term1);

        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(initialTerms, false);
        assertNull(map.get("term2"));
    }

}