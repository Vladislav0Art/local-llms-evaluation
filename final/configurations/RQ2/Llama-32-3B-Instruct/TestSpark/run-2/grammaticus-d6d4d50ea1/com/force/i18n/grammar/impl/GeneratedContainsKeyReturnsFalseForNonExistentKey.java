package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class GeneratedContainsKeyReturnsFalseForNonExistentKey {

    @Test
    public void containsKeyReturnsFalseForNonExistentKey() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertFalse(map.containsKey("non-existent-key"));
    }

}