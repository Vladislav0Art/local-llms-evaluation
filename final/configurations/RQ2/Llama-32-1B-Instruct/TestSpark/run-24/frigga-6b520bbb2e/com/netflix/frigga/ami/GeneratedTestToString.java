package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GeneratedTestToString {

    public static class AppVersionMatcher {
        @ParameterizedTest
        @MethodSource("createPatternValues")
        public void testGetPackageName(AppVersion appVersion, String packageName) {
            Matcher matcher = getAppVersionPattern().matcher(appVersion.getPackageName());
            assertEquals(packageName, matcher.group(0));
        }

        @ParameterizedTest
        @MethodSource("createPatternValues")
        public void testGetVersion(AppVersion appVersion, String version) {
            Matcher matcher = getAppVersionPattern().matcher(appVersion.getVersion());
            assertEquals(version, matcher.group(0));
        }
    }

    private static Pattern createPatternValues(MethodSource methodSource) {
        return methodSource.getMethods()
                .map(method -> new AppVersionMatcher() {{
                    Object[] arguments = method.getParameterAnnotations()[0].getArguments();
                    MethodSignature methodSignature = (MethodSignature) method;
                    assertEquals("packageName", methodSignature.getName().getParameterCount());
                    for (Object argument : arguments) {
                        if (!(argument instanceof String)) {
                            fail("Invalid argument type in getPackageName");
                        }
                    }
                }})
                .iterator()
                .filter(m -> m != null)
                .toArray()[0];
    }

    @Test
    public void testToString() {
        AppVersion version = AppVersion.parseName("ami1234567890abcdef");
        assertEquals("ami1234567890abcdef", version.toString());
        // Add more tests as needed
    }

}