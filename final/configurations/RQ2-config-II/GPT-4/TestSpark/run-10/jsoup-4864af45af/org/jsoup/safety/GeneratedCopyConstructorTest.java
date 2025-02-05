package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist safelist = new Safelist();
        Safelist copiedSafelist = new Safelist(safelist);

        assertNotNull(copiedSafelist);
    }

}