package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class GeneratedNone_SimpleText_PreserveRelativeLinks {

    @Test
    public void none_SimpleText_PreserveRelativeLinks() {
        Safelist none = new SafeList();
        assertTrue(none.preserveRelativeLinks(true));
    }

}