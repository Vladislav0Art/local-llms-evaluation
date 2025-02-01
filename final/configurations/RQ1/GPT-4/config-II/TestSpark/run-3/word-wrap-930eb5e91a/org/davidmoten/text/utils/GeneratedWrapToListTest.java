package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedWrapToListTest {

    @Test
    public void wrapToListTest() {
        List<String> lines = WordWrap.from("One Two Three Four Five Six").wrapToList();
        assertEquals("One Two Three Four Five Six", String.join("", lines));
    }

}