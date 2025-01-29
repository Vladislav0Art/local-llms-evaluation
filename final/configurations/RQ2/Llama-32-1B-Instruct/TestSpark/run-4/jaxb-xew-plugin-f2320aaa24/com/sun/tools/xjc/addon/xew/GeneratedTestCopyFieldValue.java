package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFieldValue {

    public static class ElementWrapperTest {
        @Before
        void setUp() {
        }

        @Test
        public void testCopyFieldValue() {
            // Setup
            ElementWrapperTest.ElementWrapperTest element = new ElementWrapperTest();

            // Test
            JClassContainer container = createJClassContainer(element.getJClass(), "element");
            JMethod method = new JMethod("test", container, new XmlElementWrapperPlugin().runInternal(null));

            // Teardown
        }

    }