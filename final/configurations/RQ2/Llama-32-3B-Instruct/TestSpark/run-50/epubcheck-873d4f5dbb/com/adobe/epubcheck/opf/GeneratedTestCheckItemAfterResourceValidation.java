package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestCheckItemAfterResourceValidation {

    @Test
    public void testCheckItemAfterResourceValidation() {
        OPFItem item = new OPFItem();
        boolean result = OPFChecker30.checkItemAfterResourceValidation(item);
        Mockito.when(OPFChecker30.checkItemAfterResourceValidation(Mockito.any(OPFItem.class))).thenReturn(true);
    }
}

class ValidationContext {
}

class OPFItem {
}

}