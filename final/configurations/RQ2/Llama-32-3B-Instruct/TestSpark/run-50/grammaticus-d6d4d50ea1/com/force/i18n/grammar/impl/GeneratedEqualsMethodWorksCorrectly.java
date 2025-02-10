package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedEqualsMethodWorksCorrectly {

    @Test
    public void equalsMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> map2 = new GrammaticalTermMapImpl<>();
        assertTrue(map1.equals(map2));
        assertFalse(map1.equals(null));
    }

}