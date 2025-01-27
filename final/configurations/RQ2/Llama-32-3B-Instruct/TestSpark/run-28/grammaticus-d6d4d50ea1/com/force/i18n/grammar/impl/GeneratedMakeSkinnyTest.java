package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        assertSame(GrammaticalTermMapImpl.class, new GrammaticalTermMapImpl<>().makeSkinny());
    }

}