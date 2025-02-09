package com.force.i18n.grammar.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMap<Noun> skinny = map.makeSkinny();
        assertTrue(skinny.isSkinny());
    }

}