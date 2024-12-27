package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import org.junit.Test;

import java.util.*;
import java.io.Serializable;

import static org.junit.Assert.*;

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<String>();
        assertFalse(termMap.isSkinny());
    }

}