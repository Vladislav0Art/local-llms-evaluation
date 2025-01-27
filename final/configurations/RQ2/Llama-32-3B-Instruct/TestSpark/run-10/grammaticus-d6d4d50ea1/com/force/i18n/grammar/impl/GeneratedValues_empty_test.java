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

public class GeneratedValues_empty_test {

    @Test
    public void values_empty_test() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        Collection<T> values = map.values();
        assertTrue(values.isEmpty());
    }

}