package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedBuilderWrapToListTest {

    @Test
    public void BuilderWrapToListTest() throws Exception {
        Builder builder = WordWrap.from("Some text to be tested").maxWidth(5);

        List<String> actualList = builder.wrapToList();
        List<String> expectedList = Arrays.asList("Some", "text ", "to be", "test-", "ed");

        assertEquals(expectedList, actualList);
    }

}