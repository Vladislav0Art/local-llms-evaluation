package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testParseName_ByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals("ami-1234567890abcdef", AppVersion.parseName("ami-1234567890abcdef"));
    }

    @Test
    public void testParseName_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals("ami 1234567890abcdef", AppVersion.parseName("ami 1234567890abcdef"));
    }

    @Test
    public void testParseName_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> AppVersion.parseName(null));
    }

    @Test
    public void testGetPackageNameByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals(AppVersion.getPackageName(), "ami-1234567890abcdef");
    }

    @Test
    public void testGetPackageName_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals(AppVersion.getPackageName(), "ami 1234567890abcdef");
    }
}

@Test
public void testCompareByName() {
    AppVersion appVersion1 = new AppVersion();
    AppVersion appVersion2 = new AppVersion();
    appVersion1.compareTo(appVersion2);
    assertEquals(0, AppVersion.compareNames("ami-1234567890abcdef", "ami-1234567890abcdef"));
}

@Test
public void testCompareByName_WithSpaces() {
    AppVersion appVersion1 = new AppVersion();
    AppVersion appVersion2 = new AppVersion();
    appVersion1.compareTo(appVersion2);
    assertEquals(0, AppVersion.compareNames("ami 1234567890abcdef", "ami 1234567890abcdef"));
}

@Test
public void testCompareByName_InvalidInput() {
    assertThrows(IllegalArgumentException.class, () -> AppVersion.compareNames(null, null));
}
	}

@Test
public void testGetAppVersionPattern() {
    AppVersion.appVersionPattern = AppVersion.getAppVersionPattern();
    assertEquals(AppVersion.appVersionPattern, AppVersion Pattern);
}

@Test
public void testGetAppVersionPattern_InvalidInput() {
    assertThrows(IllegalArgumentException.class, () -> AppVersion.Pattern);
}
	}

@Test
public void testGetBuildJobNameByName() {
    AppVersion.parseName("ami-1234567890abcdef");
    assertEquals(AppVersion.getBuildJobName(), "ami-1234567890abcdef");
}

@Test
public void testGetBuildJobName_WithSpaces() {
    AppVersion.parseName("ami 1234567890abcdef");
    assertEquals(AppVersion.getBuildJobName(), "ami 1234567890abcdef");
}
	}

@Test
public void testGetBuildNumberByName() {
    AppVersion.parseName("ami-1234567890abcdef");
    assertEquals(AppVersion.getBuildNumber(), "1234567890abcdef");
}

@Test
public void testGetBuildNumber_WithSpaces() {
    AppVersion.parseName("ami 1234567890abcdef");
    assertEquals(AppVersion.getBuildNumber(), "1234567890abcdef");
}
	}

@Test
public void testGetCommitByName() {
    AppVersion.parseName("ami-1234567890abcdef");
    assertEquals(AppVersion.getCommit(), "1234567890abcdef");
}

@Test
public void testGetCommit_WithSpaces() {
    AppVersion.parseName("ami 1234567890abcdef");
    assertEquals(AppVersion.getCommit(), "1234567890abcdef");
}
	}

@Test
public void testGetChangelistByName() {
    AppVersion.parseName("ami-1234567890abcdef");
    assertEquals(AppVersion.getChangelist(), "1234567890abcdef");
}

@Test
public void testGetChangelist_WithSpaces() {
    AppVersion.parseName("ami 1234567890abcdef");
    assertEquals(AppVersion.getChangelist(), "1234567890abcdef");
}
	}

@Test
public void testGetBuildJobPatternByName() {
    AppVersion.appVersionPattern = AppVersion.buildJobPattern();
    assertEquals(AppVersion.buildJobPattern(), AppVersion Pattern);
}

@Test
public void testGetBuildJobPattern_InvalidInput() {
    assertThrows(IllegalArgumentException.class, () -> AppVersion.Pattern);
}
	}

@Test
public void testGetPackageVersionByName() {
    AppVersion.parseName("ami-1234567890abcdef");
    assertEquals(AppVersion.getPackageVersion(), "ami-1234567890abcdef");
}

@Test
public void testGetPackageVersion_WithSpaces() {
    AppVersion.parseName("ami 1234567890abcdef");
    assertEquals(AppVersion.getPackageVersion(), "ami 1234567890abcdef");
}
	}

@Test
public void testGetBuildNumberByName() {
    AppVersion.parseName("ami-1234567890abcdef");
    assertEquals(AppVersion.getBuildNumber(), "1234567890abcdef");
}

@Test
public void testGetBuildNumber_WithSpaces() {
    AppVersion.parseName("ami 1234567890abcdef");
    assertEquals(AppVersion.getBuildNumber(), "1234567890abcdef");
}
	}

@Test
public void testGetCommitByName() {
    AppVersion.parseName("ami-1234567890abcdef");
    assertEquals(AppVersion.getCommit(), "1234567890abcdef");
}

@Test
public void testGetCommit_WithSpaces() {
    AppVersion.parseName("ami 1234567890abcdef");
    assertEquals(AppVersion.getCommit(), "1234567890abcdef");
}
	}

@Test
public void testToStringByName() {
    AppVersion.parseName("ami-1234567890abcdef");
    assertEquals(AppVersion.toString(), "ami-1234567890abcdef");
}

@Test
public void testToString_WithSpaces() {
    AppVersion.parseName("ami 1234567890abcdef");
    assertEquals(AppVersion.toString(), "ami 1234567890abcdef");
}

}