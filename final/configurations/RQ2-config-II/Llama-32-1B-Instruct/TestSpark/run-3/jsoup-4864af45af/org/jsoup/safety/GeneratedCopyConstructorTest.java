package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCopyConstructorTest {

    private Safelist safelist;

    @Before
    public void setup() {
        safelist = new Safelist();
    }

    @Test
    public void copyConstructorTest() throws Exception {
        Safelist safelist1 = new Safelist();
        Safelist safelist2 = safelist1.copy();
        AssertSame(safelist1, safelist2);
        assertTrue(!safelist1.equals(safelist2));
    }

}