package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedCheckItemWithNullParamsTest {

    @Test
    public void checkItemWithNullParamsTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(null, null);

        // No outputs/returns so we can't make assertions here. This test just increases coverage.
    }

}