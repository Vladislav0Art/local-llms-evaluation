package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedPreserveRelativeLinks_PreserveModePreservesLinks {

    @Test
    public void preserveRelativeLinks_PreserveModePreservesLinks() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertFalse(safelist.preserveRelativeLinks(false));
    }

}