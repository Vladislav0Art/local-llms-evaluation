package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedBasicWithImagesTest {

    @Test
    public void basicWithImagesTest() {
        Safelist result = Safelist.basicWithImages();
        assertThat(result, is(notNullValue()));
    }

}