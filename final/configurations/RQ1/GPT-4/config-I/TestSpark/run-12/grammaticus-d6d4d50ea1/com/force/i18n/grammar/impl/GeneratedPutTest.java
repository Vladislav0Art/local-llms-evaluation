package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.NounForm;
import com.force.i18n.grammar.LanguageStartsWith;
import com.force.i18n.grammar.impl.SimpleDeclension.NounForms;
import com.google.common.collect.ImmutableMap;

import java.io.*;

public class GeneratedPutTest {

    private class MockNounForm extends NounForm {
        private static final long serialVersionUID = 1L;
        private String string;

        public MockNounForm(String string) {
            super(LanguageStartsWith.CONSTANT, LanguageStartsWith.CONSTANT);
            this.string = string;
        }

        @Override
        public String getKey() {
            return string;
        }
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<MockNounForm> map = new GrammaticalTermMapImpl<>();
        map.put("test", new MockNounForm("something"));
        Assert.assertEquals(1, map.size());
    }

}