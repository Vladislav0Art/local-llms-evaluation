package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedPutMethodWorksCorrectly {

    @Test
    public void putMethodWorksCorrectly() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        map.put("term", new GrammaticalTerm());
        T value = map.get("term");
        assertNotNull(value);
    }

}