package com.force.i18n.grammar.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();

        Noun noun = Mockito.mock(Noun.class);
        map.put("test", noun);
        Set<Map.Entry<String, Noun>> entries = map.entrySet();
        assertEquals(1, entries.size());
        assertEquals(noun, entries.iterator().next().getValue());
    }

}