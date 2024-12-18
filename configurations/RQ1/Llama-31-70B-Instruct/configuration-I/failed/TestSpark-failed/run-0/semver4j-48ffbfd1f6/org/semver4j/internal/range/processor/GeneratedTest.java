package org.semver4j.internal.range.processor;

import org.junit.Test;
import org.semver4j.internal.range.processor.XRangeProcessor;
import org.semver4j.Range;
import org.semver4j.internal.Tokenizers;
import org.semver4j.internal.range.processor.RangesUtils;

import static org.junit.Assert.assertEquals;
import static org.semver4j.Range.RangeOperator.*;
import static org.semver4j.internal.Tokenizers.XRANGE;
import static org.semver4j.internal.range.processor.RangesUtils.*;
import static org.semver4j.internal.range.processor.XRangeProcessor.*;

public class GeneratedTest {

    @Test
    public void processXRangeTest() {
        XRangeProcessor xRangeProcessor = new XRangeProcessor();
        String range = "1.2.3";
        String expected = "1.2.3";
        String actual = xRangeProcessor.process(range);
        assertEquals(expected, actual);
    }

    @Test
    public void processXRangeWithXTest() {
        XRangeProcessor xRangeProcessor = new XRangeProcessor();
        String range = "1.2.x";
        String expected = ">=1.2.0 <1.3.0";
        String actual = xRangeProcessor.process(range);
        assertEquals(expected, actual);
    }

    @Test
    public void processXRangeWithXAndCompareSignTest() {
        XRangeProcessor xRangeProcessor = new XRangeProcessor();
        String range = ">=1.2.x";
        String expected = ">=1.2.0 <1.3.0";
        String actual = xRangeProcessor.process(range);
        assertEquals(expected, actual);
    }

}