package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist result = Safelist.simpleText();
        assertThat(result, is(notNullValue()));
    }

}