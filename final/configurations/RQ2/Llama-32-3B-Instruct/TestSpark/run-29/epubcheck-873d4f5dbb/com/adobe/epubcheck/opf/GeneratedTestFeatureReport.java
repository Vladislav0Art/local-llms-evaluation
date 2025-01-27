package com.adobe.epubcheck.opf;

public class GeneratedTestFeatureReport {

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

}