package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHiddenClass {

    private JClassClassContainer container = new JClassClassContainer();

    @Test
    public void testHiddenClass() {
        // Given
        JAnnotatable annotatable = new JAnnotatable(container);

        // When
        ObjectUtils.asObject(annotatable);

        // Then
        assertNotEquals("value", annotatable.toString().split("\\r?\\n")[0]);
    }

}