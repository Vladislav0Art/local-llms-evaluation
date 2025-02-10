package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCheckItemAfterResourceValidation {

    @Test
    public void checkItemAfterResourceValidation() {
        OPFItem item = new OPFItem();
        boolean result = true;

        Mockito.when(OPFChecker30.checkItemAfterResourceValidation(item)).thenReturn(result);
    }
}

class OPFItem {
}

}