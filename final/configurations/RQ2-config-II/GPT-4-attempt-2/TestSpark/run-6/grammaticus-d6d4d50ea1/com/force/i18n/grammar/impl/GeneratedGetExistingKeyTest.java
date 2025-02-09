package com.force.i18n.grammar.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;

public class GeneratedGetExistingKeyTest {

    @Test
    public void getExistingKeyTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();

        Noun noun = Mockito.mock(Noun.class);
        map.put("test", noun);
        assertEquals(noun, map.get("test"));
    }

}