package com.force.i18n.grammar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;
import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedWriteJsonWithNoRenamingProviderTest {

    @Test
    public void writeJsonWithNoRenamingProviderTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.put("test", new MockGrammaticalTerm());
        StringBuilder appendable = new StringBuilder();

        try {
            map.writeJson(appendable, null, null, new HashSet<String>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class MockGrammaticalTerm implements GrammaticalTerm {
        @Override
        public String getName() {
            return "mock";
        }

        @Override
        public void toJson(StringBuilder sb) {
            sb.append(getName());
        }
    }

}