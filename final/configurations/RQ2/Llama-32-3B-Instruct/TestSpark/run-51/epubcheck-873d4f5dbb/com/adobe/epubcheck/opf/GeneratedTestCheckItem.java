package com.adobe.epubcheck.opf;

public class GeneratedTestCheckItem {

    // ...
}

public abstract class ValidationContext {
    // ...
}

public class OPFChecker30 extends ValidationContext {
    private boolean validationResult;

    public OPFChecker30() {
        // ...
    }

    public void initHandler() {
        // ...
    }

    public boolean checkPackage() {
        return false;
    }

    public boolean checkContent() {
        return false;
    }

    public boolean checkItem(OFItem item, OPFHandler handler) {
        return true;
    }

    public boolean getValidationResult() {
        return validationResult;
    }
}

public class OPFHandler {
    public boolean validate(OFItem item) {
        return true;
    }
}

public class GeneratedTest {

    @Mock
    public OPFHandler handler;

    private OPFChecker30 subject;

    @Before
    public void setup() {
        subject = new OPFChecker30();
        subject.initHandler();
    }

    @Test
    public void testCheckItem() {
        OFItem item = new OFItem();
        OPFHandler handler = new OPFHandler();
        boolean result = subject.checkItem(item, handler);
        Mockito.when(handler.validate(item)).thenReturn(true);
        assertTrue(result);
    }

}