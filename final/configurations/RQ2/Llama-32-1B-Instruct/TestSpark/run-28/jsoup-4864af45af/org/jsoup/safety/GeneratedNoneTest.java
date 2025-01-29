package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist none = new Safelist();
        assertTrue(none.isSafeTag(""));
        assertTrue(none.isSafeAttribute("test", "", ""));
    }

}