package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedGetMethodWorksCorrectly {

    @Test
    public void getMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTerm term = map.get("term");
        assertNull(term);
    }

}