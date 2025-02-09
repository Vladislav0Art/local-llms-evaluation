package com.force.i18n.grammar.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;

public class GeneratedEqualsDifferentTypeTest {

    @Test
    public void equalsDifferentTypeTest() {
        GrammaticalTermMapImpl<Noun> map1 = new GrammaticalTermMapImpl<>();
        assertFalse(map1.equals(new Object()));
    }

}