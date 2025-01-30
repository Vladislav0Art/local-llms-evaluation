package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedPutExceptionTest {


    private class GrammaticalTermMock implements GrammaticalTerm {
        private String name;

        public GrammaticalTermMock(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void toJson(Appendable appendable) throws java.io.IOException {

        }
    }

    @Test
    public void putExceptionTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        termMap.put("test", new GrammaticalTermMock("test"));
    }

}