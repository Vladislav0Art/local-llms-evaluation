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

public class GeneratedIsEmptyTest {

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
    public void isEmptyTest() {
        GrammaticalTermMapImpl<MockNounForm> map = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(map.isEmpty());
        map.put("test", new MockNounForm("something"));
        Assert.assertFalse(map.isEmpty());
    }

}