package com.force.i18n.grammar.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;

public class GeneratedGetNonExistingKeyTest {

    @Test
    public void getNonExistingKeyTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        assertNull(map.get("test"));
    }

}