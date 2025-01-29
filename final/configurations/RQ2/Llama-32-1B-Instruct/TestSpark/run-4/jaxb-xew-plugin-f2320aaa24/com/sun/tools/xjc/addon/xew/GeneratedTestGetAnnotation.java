package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    public static class ElementWrapperTest {
        @Before
        void setUp() {
        }

        @Test
        public void testGetAnnotation() {
            // Setup
            ElementWrapperTest.ElementWrapperTest element = new ElementWrapperTest();

            // Test
            JAnnotatable annotatable = createJAnnotatable();
            element.getAnnotation().getAnnotation();

            // Teardown
        }

    }