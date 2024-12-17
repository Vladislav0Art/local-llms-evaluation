package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetBuildJobName_PackagenameDoesntMatch {

    @Mock
    private Pattern getAppVersionPattern();

    @InjectMocks
    private AppVersion parseName(String amiName) {
        return new AppVersion();
    }

    public void testParseName_PackageAndVersionMatch() {
        String amiName = "1.0.0";
        when(getAppVersionPattern()).thenReturn(Pattern.compile("1\\d{6}"));
        AppVersion appVersion = parseName(amiName);
        assertThat(appVersion.getPackageName(), is("1.0.0"));
        assertThat(appVersion.getVersion(), is("1.0"));
    }

    public void testParseName_PackageAndVersionNotMatch() {
        String amiName = "a.b.c";
        when(getAppVersionPattern()).thenReturn(Pattern.compile("\\d{6}"));
        AppVersion appVersion = parseName(amiName);
        assertThat(appVersion.getPackageName(), is(null));
        assertThat(appVersion.getVersion(), is(null));
    }

    public void testGetPackageAndVersion_PackageMatch() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("1.0.0");
        when(getAppVersionPattern()).thenReturn(Pattern.compile("1\\d{6}"));
        when(any().matches("1\\d{6}")).thenReturn(true);
        AppVersion appVersion2 = parseName(amiName);
        assertThat(appVersion.getPackageName(), is("1.0.0"));
    }

    public void testGetPackageAndVersion_PackageNotMatch() {
        AppVersion appVersion = new AppVersion();
        when(getAppVersionPattern()).thenReturn(Pattern.compile("\\d{6}"));
        when(any().matches("\\d{6}")).thenReturn(false);
        AppVersion appVersion2 = parseName(amiName);
        assertThat(appVersion.getPackageName(), is(null));
    }

    @Test
    public void testGetBuildJobName_PackagenameDoesntMatch() {
        AppVersion appVersion = new AppVersion();
        when(getAppVersionPattern()).thenReturn(Pattern.compile("\\d{6}"));
        boolean result = parseName(amiName).getBuildJobName().matches("a\\d{6}");
        assertThat(result, is(false));
    }

}