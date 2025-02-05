package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedIsEmptyFalseTest {

    @Test
    public void isEmptyFalseTest() {
        GrammaticalTermMapImpl<Vehicle> map = new GrammaticalTermMapImpl<>();
        map.put("Car", new Vehicle("Car"));
        Assert.assertFalse(map.isEmpty());
    }

    class Vehicle extends GrammaticalTerm {
        private String name;

        public Vehicle(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

}