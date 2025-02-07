package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedBasic_PreserveRelativeLinks {

    @Test
    public void basic_PreserveRelativeLinks() {
        Safelist none = new SafeList();
        assertTrue(none.preserveRelativeLinks(true));
    }

}