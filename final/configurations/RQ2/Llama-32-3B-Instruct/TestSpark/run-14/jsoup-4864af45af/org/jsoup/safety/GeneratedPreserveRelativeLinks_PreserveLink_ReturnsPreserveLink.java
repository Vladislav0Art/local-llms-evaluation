package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedPreserveRelativeLinks_PreserveLink_ReturnsPreserveLink {

    @Test
    public void preserveRelativeLinks_PreserveLink_ReturnsPreserveLink() {
        Safelist result = new Safelist().preserveRelativeLinks(true);
        assertTrue(result.preservesRelativeLinks());
    }

}