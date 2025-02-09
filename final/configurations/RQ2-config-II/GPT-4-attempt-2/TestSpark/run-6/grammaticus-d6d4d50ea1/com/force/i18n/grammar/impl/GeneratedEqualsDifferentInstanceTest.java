package com.force.i18n.grammar.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;

public class GeneratedEqualsDifferentInstanceTest {

    @Test
    public void equalsDifferentInstanceTest() {
        GrammaticalTermMapImpl<Noun> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> map2 = new GrammaticalTermMapImpl<>();
        assertTrue(map1.equals(map2));
    }

}