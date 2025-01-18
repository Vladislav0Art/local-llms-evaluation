package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        HashMap<String, GrammaticalTermImpl> map = new HashMap<>();
        GrammaticalTermImpl term = mock(GrammaticalTermImpl.class);
        map.put("key", term);
        GrammaticalTermMapImpl<GrammaticalTermImpl> impl = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(term, impl.get("key"));
    }

}