package com.force.i18n.grammar.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<Noun> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> map2 = new GrammaticalTermMapImpl<>();

        Noun noun = Mockito.mock(Noun.class);
        map2.put("test", noun);
        map1.putAll(map2);
        assertEquals(noun, map1.get("test"));
    }

}