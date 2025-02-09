package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetNonExistentValueTest {

    @Test
    public void getNonExistentValueTest() {
        GrammaticalTermMapImpl<Noun> termMapImpl = new GrammaticalTermMapImpl<>();
        Noun noun = termMapImpl.get("name");
        assertNull(noun);
    }

}