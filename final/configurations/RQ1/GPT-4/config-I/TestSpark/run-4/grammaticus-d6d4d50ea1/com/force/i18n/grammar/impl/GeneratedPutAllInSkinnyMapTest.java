package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class GeneratedPutAllInSkinnyMapTest {

    class DummyGrammaticalTerm implements GrammaticalTerm {
        @Override
        public String getName() {
            return "dummy";
        }

        @Override
        public void toJson(Appendable out) throws IOException {
            out.append("{}");
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            return super.equals(o);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    @Test
    public void putAllInSkinnyMapTest() {
        GrammaticalTermMapImpl<DummyGrammaticalTerm> map1 = new GrammaticalTermMapImpl<DummyGrammaticalTerm>(new HashMap<>(), true);
        GrammaticalTermMapImpl<DummyGrammaticalTerm> map2 = new GrammaticalTermMapImpl<DummyGrammaticalTerm>(new HashMap<>(), false);
        map1.putAll(map2);
    }

}