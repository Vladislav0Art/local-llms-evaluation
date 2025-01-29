package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        String[] args1 = {"ami-12345678", "abcde"};
        String[] args2 = {"ami-12345679", "defgh"};

        AppVersion appVersion1 = new AppVersion("ami-12345678");
        AppVersion appVersion2 = new AppVersion("ami-12345678");

        assertThat(appVersion1.equals(appVersion2), is(false));

        AppVersion appVersion3 = new AppVersion("ami-12345679");
        AppVersion appVersion4 = new AppVersion("ami-12345678");

        assertThat(appVersion1.equals(appVersion3), is(true));
    }

}