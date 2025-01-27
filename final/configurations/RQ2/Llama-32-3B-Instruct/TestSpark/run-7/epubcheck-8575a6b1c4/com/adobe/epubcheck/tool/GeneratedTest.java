package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void getLocale

    Test() {
        EpubChecker instance = new EpubChecker();
        Locale locale = instance.getLocale();
        assertEquals(Locale.ROOT, locale);
    }

    @Test
    public void run

    Test() {
        String[] args = {"path", "profile"};
        EpubChecker instance = new EpubChecker();
        int result = instance.run(args);
        assertEquals(0, result);
    }

    @Test
    public void processEpubFile

    DeprecatedTest() {
        @Deprecated String[] args = {"path", "profile"};
        EpubChecker instance = new EpubChecker();
        int result = instance.processEpubFile(args);
        assertTrue(result == -1);
    }

    @Test
    public void validateFile

    Test() throws Exception {
        File path = new File("test.epub");
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(path.toURI(), EPUBVersion.VERSION_30, null, null);
        assertEquals(0, result);
    }

    @Test
    public void validateFile

    Test2() throws Exception {
        File path = new File("test.epub");
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(path.toURI(), EPUBVersion.VERSION_30, null, null);
        assertEquals(1, result);
    }
}

@Test
public void runWithEpubProfile

Test() {
    EpubChecker instance = Mockito.mock(EpubChecker.class);
    Mockito.when(instance.getLocale()).thenReturn(Locale.ROOT);
    String[] args = {"path", "profile"};
    int result = instance.run(args);
    assertEquals(0, result);
}

@Test
public void runWithInvalidEpubProfile

Test() {
    EpubChecker instance = Mockito.mock(EpubChecker.class);
    Mockito.when(instance.getLocale()).thenReturn(Locale.ROOT);
    String[] args = {"path", "invalidProfile"};
    int result = instance.run(args);
    assertEquals(-1, result);
}
	}

@Test
public void createEpubCheck

Test() {
    EpubCheckerFactory factory = new EpubCheckerFactory();
    EpubCheck instance = factory.createEpubCheck("path", "profile");
    assertNotNull(instance);
}

@Test
public void createEpubCheckWithInvalidProfile

Test() {
    EpubCheckerFactory factory = new EpubCheckerFactory();
    String[] args = {"path", "invalidProfile"};
    EpubCheck instance = factory.createEpubCheck(args[0], args[1]);
    assertNull(instance);
}

}