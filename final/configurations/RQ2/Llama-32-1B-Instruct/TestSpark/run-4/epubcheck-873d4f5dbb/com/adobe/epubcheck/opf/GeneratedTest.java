package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void testOPFItem() {
        // Arrange
        String type = "audio/mpeg";
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        boolean result = OPFChecker30.isAudioType(type);
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, "audio/mpeg");

        // Assert
        assertTrue(result);
        assertEquals(preferredMediaType, expectedPreferedsMediaTypes());
    }

    @Test
    public void testOPFItemNoType() {
        // Arrange
        String type = "";
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        boolean result = OPFChecker30.isAudioType(type);
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, "");

        // Assert
        assertFalse(result);
        assertEquals(expectedPreferedsMediaTypes(), expectedPreferedsMediaTypes());
    }

    @Test
    public void testOPFItemNoPath() {
        // Arrange
        String type = "audio/mpeg";
        OPFItem item = new OPFItem("Audio", "");

        // Act
        boolean result = OPFChecker30.isAudioType(type);
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, "");

        // Assert
        assertFalse(result);
        assertEquals(expectedPreferedsMediaTypes(), expectedPreferedsMediaTypes());
    }

    @Test
    public void testOPFItemNoPathAndType() {
        // Arrange
        String type = "";
        OPFItem item = new OPFItem("Audio", "");

        // Act
        boolean result = OPFChecker30.isAudioType(type);
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, "");

        // Assert
        assertFalse(result);
        assertEquals(expectedPreferedsMediaTypes(), expectedPreferedsMediaTypes());
    }

    @Test
    public void testOPFItemNoContent() {
        // Arrange
        boolean checkContentResult = false;
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        checkItem(item, null);

        // Assert
        assertTrue(checkContentResult);
    }

    @Test
    public void testOPFItemNoHandler() {
        // Arrange
        boolean checkItemAfterResourceValidationResult = false;
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        checkItemAfterResourceValidation(item);

        // Assert
        assertTrue(checkItemAfterResourceValidationResult);
    }

    @Test
    public void testOPFItemNoHandlerAndItem() {
        // Arrange
        boolean checkSpineItemResult = false;
        OPFItem item = new OPFItem("Audio", "mpeg");

        // Act
        checkSpineItem(item, null);

        // Assert
        assertTrue(checkSpineItemResult);
    }

    @Test
    public void testOPFItemNoHandlerAndItemAndContent() {
        // Arrange
        boolean checkItemAfterResourceValidationResult = false;
        OPFItem item = new OPFItem("Audio", "mpeg");
        boolean checkContentResult = true;

        // Act
        checkItemAfterResourceValidation(item);
        checkItem(item, null);

        // Assert
        assertTrue(checkItemAfterResourceValidationResult);
        assertTrue(checkContentResult);
    }

    private static Set<String> expectedPreferedsMediaTypes() {
        return Set.of("audio/mpeg");
    }

}