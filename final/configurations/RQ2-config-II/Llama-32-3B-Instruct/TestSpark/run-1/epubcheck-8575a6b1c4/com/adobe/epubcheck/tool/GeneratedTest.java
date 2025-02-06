package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Locale locale;

    @Mock
    private String[] args;

    @Mock
    private Map<String, Object> map;

    @Test
    public void getLocale_ReturnsNotNull() {
        when(locale).thenReturn(new Locale("en", "US"));
        assertEquals(locale, EpubChecker instance().getLocale());
    }

    @Test
    public void run_ReturnsValidFileResult() throws Exception {
        when(EpubCheckFactory.getInstance()).thenReturn(new EpubCheck() {
            @Override
            public int validateFile(String path, EPUBVersion version) {
                return 0;
            }
        });
        assertEquals(0, instance().run(args));
    }

    @Test
    public void run_ReturnsInvalidFileResult() throws Exception {
        when(EpubCheckFactory.getInstance()).thenReturn(new EpubCheck() {
            @Override
            public int validateFile(String path, EPUBVersion version) {
                return 1;
            }
        });
        assertEquals(1, instance().run(args));
    }

    @Test
    public void getLocale_ReturnsNull() {
        when(locale).thenReturn(null);
        assertNull(EpubChecker instance().getLocale());
    }

    private EpubChecker instance() {
        return new EpubChecker();
    }
}

@Test
public void withOPFValidatorReturnsValidationContext() {
    when(validationContext.withOPFValidator()).thenReturn(validationContext);
    assertEquals(validationContext, instance().withOPFValidator());
}

@Test
public void withoutOPFValidatorReturnsNull() {
    when(validationContext.withOPFValidator()).thenReturn(null);
    assertNull(EpubChecker instance().withOPFValidator());
}

private EpubChecker instance() {
    return new EpubChecker();
}
	}

@Test
public void getInstance_ReturnsEpubCheckInstance() {
    when(EpubCheckFactory.getInstance()).thenReturn(epubCheck);
    assertEquals(epubCheck, instance().getInstance());
}

@Test
public void getInstance_ReturnsNullWhenInstanceIsNull() {
    when(EpubCheckFactory.getInstance()).thenReturn(null);
    assertNull(instance().getInstance());
}

private EpubChecker instance() {
    return new EpubChecker();
}
	}

@Test
public void validateOPFFile_ReturnsValidationResult() {
    when(opfChecker.validateOPFFile()).thenReturn(0);
    assertEquals(0, instance().validateOPFFile());
}

@Test
public void validateOPFFile_ReturnsInvalidResult() {
    when(opfChecker.validateOPFFile()).thenReturn(1);
    assertEquals(1, instance().validateOPFFile());
}

private EpubChecker instance() {
    return new EpubChecker();
}
	}

@Test
public void getInstance_ReturnsEpubCheckInstance() {
    when(EpubCheckFactory.getInstance()).thenReturn(new EpubCheck());
    assertEquals(new EpubCheck(), instance().getInstance());
}

@Test
public void getInstance_ReturnsNullWhenInstanceIsNull() {
    when(EpubCheckFactory.getInstance()).thenReturn(null);
    assertNull(instance().getInstance());
}

private EpubChecker instance() {
    return new EpubChecker();
}

}