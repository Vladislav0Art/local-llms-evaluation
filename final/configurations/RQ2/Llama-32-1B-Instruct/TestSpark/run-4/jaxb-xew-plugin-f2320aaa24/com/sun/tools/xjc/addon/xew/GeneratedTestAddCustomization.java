package com.sun.tools.xjc.addon.xew;

public class GeneratedTestAddCustomization {

    public static class ElementWrapperTest {
        @Before
        void setUp() {
        }

        @Test
        public void testAddCustomization() {
            // Setup
            ElementWrapperTest.ElementWrapperTest element = new ElementWrapperTest();

            // Test
            JAnnotatable annotatable = createJAnnotatable();
            JClassContainer container = createJClassContainer(annotatable, "element");
            element.getAnnotation().setCustomization(getCustomization(container));

            // Teardown
        }

    }