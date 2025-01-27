package com.adobe.epubcheck.tool;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedTestValidateFile_WithMock_ThrowsException {

    public interface Report {
        // add methods here
    }

    public interface EPUBProfile {
        // add methods here
    }

    @Mock
    private Checker checker;

    @InjectMocks
    private FileResourceProvider fileResourceProvider;

    public void testValidateFile() {
        String path = "/path/to/file";
        int expectedExitCode = 0;
        Exception exception = null;
        when(checker.validateFile(path, any(), any(), any())).thenReturn(expectedExitCode);

        FileResourceProvider actual = new FileResourceProvider();
        int result = actual.validateFile(path);
        assertEquals(expectedExitCode, result);

        try {
            checker.validateFile(path, any(), any(), any());
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertEquals(exception, e);
        }
    }

    @Test
    public void testValidateFile_WithMock_ThrowsException() {
        String path = "/path/to/file";
        when(fileResourceProvider.validateFile(path)).thenThrow(new RuntimeException());

        assertThrows(RuntimeException.class, () -> fileResourceProvider.validateFile(path));
    }

}