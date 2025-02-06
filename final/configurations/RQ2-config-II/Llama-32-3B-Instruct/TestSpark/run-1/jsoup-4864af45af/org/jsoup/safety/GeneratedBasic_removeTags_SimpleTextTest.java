package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;

public class GeneratedBasic_removeTags_SimpleTextTest {

    @Test
    public void basic_removeTags_SimpleTextTest() {
        Safelist basicRemoveImg = Safelist.basic().removeTags("img");
        assertFalse(basicRemoveImg.isSafeTag("img"));
        assertTrue(basicRemoveImg.isSafeTag("p"));
    }

}