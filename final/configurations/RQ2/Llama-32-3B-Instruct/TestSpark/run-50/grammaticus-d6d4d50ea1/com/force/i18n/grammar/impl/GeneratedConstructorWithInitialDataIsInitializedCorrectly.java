package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GeneratedConstructorWithInitialDataIsInitializedCorrectly {

    @Test
    public void constructorWithInitialDataIsInitializedCorrectly() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        GrammaticalTermMapImpl<T> mapImpl = new GrammaticalTermMapImpl<>(map, false);
        assertNotNull(mapImpl);
    }

}