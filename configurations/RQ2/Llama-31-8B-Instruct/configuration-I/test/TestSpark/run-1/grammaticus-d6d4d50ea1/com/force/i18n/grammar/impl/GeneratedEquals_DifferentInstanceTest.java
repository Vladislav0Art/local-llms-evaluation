package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_DifferentInstanceTest {

    @Test
    public void equals_DifferentInstanceTest() {
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> other = new GrammaticalTermMapImpl<>();
        assertFalse(instance.equals(other));
    }

}