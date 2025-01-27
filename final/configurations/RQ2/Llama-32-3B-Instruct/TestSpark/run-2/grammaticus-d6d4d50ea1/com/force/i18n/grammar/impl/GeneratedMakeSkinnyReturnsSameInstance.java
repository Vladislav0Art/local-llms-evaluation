package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class GeneratedMakeSkinnyReturnsSameInstance {

    @Test
    public void makeSkinnyReturnsSameInstance() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertTrue(map.makeSkinny().equals(map));
    }

}