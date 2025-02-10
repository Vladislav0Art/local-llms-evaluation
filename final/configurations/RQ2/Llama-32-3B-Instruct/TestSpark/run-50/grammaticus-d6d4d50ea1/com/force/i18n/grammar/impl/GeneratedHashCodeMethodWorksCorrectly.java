package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedHashCodeMethodWorksCorrectly {

    @Test
    public void hashCodeMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> map2 = new GrammaticalTermMapImpl<>();
        assertEquals(0, map1.hashCode());
        assertEquals(0, map2.hashCode());
    }

}