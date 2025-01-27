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

public class GeneratedEntrySet_empty_test {

    @Test
    public void entrySet_empty_test() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        assertTrue(entries.isEmpty());
    }

}