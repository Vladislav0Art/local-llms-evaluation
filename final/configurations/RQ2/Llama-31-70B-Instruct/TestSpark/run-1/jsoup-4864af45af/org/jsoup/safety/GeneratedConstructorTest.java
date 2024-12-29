package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        Safelist copy = mock(Safelist.class);
        Safelist safelist = new Safelist(copy);
        assertNotNull(safelist);
    }

}