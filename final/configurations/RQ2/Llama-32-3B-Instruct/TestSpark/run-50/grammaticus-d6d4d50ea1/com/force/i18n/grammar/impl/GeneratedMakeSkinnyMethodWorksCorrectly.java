package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedMakeSkinnyMethodWorksCorrectly {

    @Test
    public void makeSkinnyMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<T> skinnyMap = map.makeSkinny();
        assertNotNull(skinnyMap);
        assertTrue(skinnyMap.isSkinny());
    }

}