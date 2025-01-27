package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30 {

    @Test
    public void testOPFChecker30() {
        OPFChecker30 opfChecker30 = new OPFChecker30();
        ValidationContext validationContext = new ValidationContext();
        assertTrue(opfChecker30.checkPackage(validationContext, null));
        assertFalse(opfChecker30.checkSpineItem(validationContext, null));
    }
}

class OPFChecker30 {

    public boolean checkPackage(ValidationContext validationContext, Object obj) {
        return true;
    }

    public boolean checkSpineItem(ValidationContext validationContext, Object obj) {
        return false;
    }
}

public class ValidationContext {
    private boolean isPackage;

    public void setIsPackage(boolean isPackage) {
        this.isPackage = isPackage;
    }

    public boolean isPackage() {
        return isPackage;
    }
}

class FeatureEnum implements Comparable<FeatureEnum> {
    private int value;

    public FeatureEnum(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(FeatureEnum o) {
        return Integer.compare(value, o.value);
    }

}