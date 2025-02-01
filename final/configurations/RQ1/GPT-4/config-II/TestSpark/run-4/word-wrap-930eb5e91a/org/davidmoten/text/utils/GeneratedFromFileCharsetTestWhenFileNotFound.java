package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class GeneratedFromFileCharsetTestWhenFileNotFound {

    @Test
    public void fromFileCharsetTestWhenFileNotFound() {
        WordWrap.from(new File("NotExisting/Nonexisting.txt"), StandardCharsets.UTF_8);
    }

}