package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist result = Safelist.none();
        assertThat(result, is(notNullValue()));
    }

}