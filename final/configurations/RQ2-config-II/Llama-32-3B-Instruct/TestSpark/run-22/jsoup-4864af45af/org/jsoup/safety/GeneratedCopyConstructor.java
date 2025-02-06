package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GeneratedCopyConstructor {

    @Test
    public void copyConstructor() {
        Safelist safelist1 = new Safelist();
        Safelist safelist2 = new Safelist(safelist1);
        assertEquals(safelist1, safelist2);
    }

}