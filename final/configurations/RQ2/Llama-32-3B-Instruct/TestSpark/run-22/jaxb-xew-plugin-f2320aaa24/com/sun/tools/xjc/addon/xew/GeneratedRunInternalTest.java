package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternalTest {

    @Test
    public void runInternalTest() throws Exception {
        // Given
        Outline outline = null;

        // When
        Exception result = XmlElementWrapperPlugin.runInternal(outline);

        // Then
        assertNull(result);
    }

}