package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedPutAllMethodWorksCorrectly {

    @Test
    public void putAllMethodWorksCorrectly() throws IOException {
        GrammaticalTermMap<T> other = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        map.putAll(other);
        assertEquals(0, other.get("term").hashCode());
    }

}