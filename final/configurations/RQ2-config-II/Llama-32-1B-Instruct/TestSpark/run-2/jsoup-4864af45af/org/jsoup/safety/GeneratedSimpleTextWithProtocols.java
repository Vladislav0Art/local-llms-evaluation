package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedSimpleTextWithProtocols {

    @Test
    public void simpleTextWithProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.simpleText().isSafeTag("img"));
    }

}