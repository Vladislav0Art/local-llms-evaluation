package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedNone_SafeList_isCorrectlyCreated {

    @Test
    public void none_SafeList_isCorrectlyCreated() {
        Safelist safeList = Safelist.none();
        assertTrue(safeList == null);
    }

}