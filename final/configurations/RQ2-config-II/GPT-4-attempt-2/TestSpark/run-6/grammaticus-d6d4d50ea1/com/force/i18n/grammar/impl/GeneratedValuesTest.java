package com.force.i18n.grammar.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();

        Noun noun = Mockito.mock(Noun.class);
        map.put("test", noun);
        Collection<Noun> values = map.values();
        assertEquals(1, values.size());
        assertEquals(noun, values.iterator().next());
    }

}