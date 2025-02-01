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

public class GeneratedFromInvalidFileTest {

    @Test
    public void fromInvalidFileTest() {
        exception.expect(IORuntimeException.class);
        WordWrap.from(new File("doesnotexist.txt"), StandardCharsets.UTF_8);
    }

}