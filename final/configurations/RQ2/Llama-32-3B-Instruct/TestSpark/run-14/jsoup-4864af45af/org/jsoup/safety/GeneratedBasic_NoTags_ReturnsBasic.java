package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedBasic_NoTags_ReturnsBasic {

    @Test
    public void basic_NoTags_ReturnsBasic() {
        Safelist result = Safelist.basic();
        assertTrue(result.isEmpty());
    }

}