package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedMaxWidthLessThanEqualToZeroTest {

    @Test
    public void maxWidthLessThanEqualToZeroTest() {
        WordWrap.from("Test").maxWidth(0).wrap();
    }

}