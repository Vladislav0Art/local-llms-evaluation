package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedEntrySetMethodWorksCorrectly {

    @Test
    public void entrySetMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        assertNotNull(entries);
    }

}