package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedNone_PreserveRelativeLinks_ReturnsNone {

    @Test
    public void none_PreserveRelativeLinks_ReturnsNone() {
        assertSame(Safelist.none(), Safelist.none().preserveRelativeLinks(false));
    }

}