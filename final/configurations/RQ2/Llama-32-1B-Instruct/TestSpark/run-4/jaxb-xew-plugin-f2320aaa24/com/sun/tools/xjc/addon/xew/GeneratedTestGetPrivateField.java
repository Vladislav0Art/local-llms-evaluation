package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateField {

    public static class ElementWrapperTest {
        @Before
        void setUp() {
        }

        @Test
        public void testGetPrivateField() {
            // Setup
            ElementWrapperTest.ElementWrapperTest element = new ElementWrapperTest();

            // Test
            JClassContainer container = createJClassContainer(element.getJClass(), "element");
            JFieldVar field = (JFieldVar) container getField(field);

            // Teardown
        }

    }