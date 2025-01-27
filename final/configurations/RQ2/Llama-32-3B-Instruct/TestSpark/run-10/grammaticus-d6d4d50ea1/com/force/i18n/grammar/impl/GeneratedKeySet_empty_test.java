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

public class GeneratedKeySet_empty_test {

    @Test
    public void keySet_empty_test() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Set<String> keys = map.keySet();
        assertTrue(keys.isEmpty());
    }

}