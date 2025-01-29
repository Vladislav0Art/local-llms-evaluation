package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHasPropertyNameCustomization {

    public static class ElementWrapperTest {
        @Before
        void setUp() {
        }

        @Test
        public void testHasPropertyNameCustomization() {
            // Setup
            ElementWrapperTest.ElementWrapperTest element = new ElementWrapperTest();

            // Test
            JAnnotatable annotatable = createJAnnotatable();
            JClassContainer container = createJClassContainer(annotatable, "element");
            element.getAnnotation().hasPropertyNameCustomization();

            // Teardown
        }

    }