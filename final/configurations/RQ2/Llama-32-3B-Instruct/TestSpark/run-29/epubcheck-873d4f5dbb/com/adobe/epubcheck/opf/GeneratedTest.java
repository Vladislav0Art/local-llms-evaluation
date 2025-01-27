package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void testEPUBLocation() {
        EPUBLocation epubLocation = new EPUBLocation();
        assertEquals("path/to/location", (String) epubLocation.getLocation());
    }
}

class EPUBLocation {
    private String location;

    public EPUBLocation() {
        this.location = "path/to/location";
    }

    @Override
    public String toString() {
        return location;
    }
}

@Test
public void testFeatureReport() {
    FeatureReport featureReport = new FeatureReport();
    Object[] featuresArray = featureReport.getFeatures();
    assertEquals(2, featuresArray.length);
    for (Object obj : featuresArray) {
        if (obj instanceof FeatureEnum) {
            FeatureEnum featureEnum = (FeatureEnum) obj;
            assertTrue(featureEnum == FeatureEnum.FEATURE1 || featureEnum == FeatureEnum.FEATURE2);
        }
    }
}
		}

class FeatureReport {
    private FeatureEnum[] features;

    public FeatureReport() {
        this.features = new FeatureEnum[]{FeatureEnum.FEATURE1, FeatureEnum.FEATURE2};
    }

    @Override
    public String toString() {
        return "FeatureReport{" +
                "features=" + java.util.Arrays.toString(features) +
                '}';
    }

    public Object[] getFeatures() {
        return features;
    }
}

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