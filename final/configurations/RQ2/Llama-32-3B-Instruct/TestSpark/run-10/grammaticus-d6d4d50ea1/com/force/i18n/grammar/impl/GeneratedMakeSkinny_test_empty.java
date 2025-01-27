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

public class GeneratedMakeSkinny_test_empty {

    @Test
    public void makeSkinny_test_empty() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> skinnyMap = map.makeSkinny();
        assertTrue(skinnyMap == null);
    }

}