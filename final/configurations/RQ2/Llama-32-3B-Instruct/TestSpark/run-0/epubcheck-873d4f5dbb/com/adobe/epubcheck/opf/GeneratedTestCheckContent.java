package com.adobe.epubcheck.opf;

public class GeneratedTestCheckContent {

    private String type;
    private String content;

    public OPFItem(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }
}

public class OPFHandler {
    // handler methods...
}

public class OPFChecker30 {
    @Inject
    private OPFHandler handler;

    public boolean checkItem(OPFItem item) {
        if (item.getType().equals("audio")) {
            // audio specific checks...
            return true;
        } else if (item.getType().equals("font")) {
            // font specific checks...
            return false;
        }
        // other types...
    }

    @Inject
    private Assert assertClass;

    public boolean checkContent() {
        OPFItem item = new OPFItem("audio", "test content");
        return checkItem(item);
    }
}

public class TestOPFChecker30 {

    @Test
    public void testCheckContent() {
        OPFChecker30 checker = new OPFChecker30();
        boolean result = checker.checkContent();
        Assert.assertFalse(result);
    }

}