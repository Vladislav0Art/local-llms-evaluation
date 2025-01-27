package com.netflix.frigga.ami;

public class GeneratedCompareTo_DifferentObjects_ReturnsNegativeOrPositiveValue {

    public List<String> getChangelist() {
        return new ArrayList<>();
    }
}

public class AppVersionWrapper {
    private final AppVersion appVersion;

    public AppVersionWrapper(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    public List<String> getChangelist() {
        return appVersion.getChangelist();
    }
}

public class GeneratedTest {

    @Test
    public void compareTo_DifferentObjects_ReturnsNegativeOrPositiveValue() throws Exception {
        AppVersion appVersion1 = new AppVersionWrapper(new AppVersion());
        AppVersion appVersion2 = new AppVersionWrapper(new AppVersion());

        // Test logic
    }

}