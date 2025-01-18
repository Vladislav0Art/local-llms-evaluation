package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedCheckSpineItemWithNullParamsTest {

    @Test
    public void checkSpineItemWithNullParamsTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkSpineItem(null, null);

        // No outputs/returns so we can't make assertions here. This test just increases coverage.
    }

}