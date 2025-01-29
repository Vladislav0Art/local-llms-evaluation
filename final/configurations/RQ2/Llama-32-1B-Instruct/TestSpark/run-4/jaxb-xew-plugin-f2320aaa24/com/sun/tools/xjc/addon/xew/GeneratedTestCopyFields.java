package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    public static class ElementWrapperTest {
        @Before
        void setUp() {
        }

        @Test
        public void testCopyFields() {
            // Setup
            ElementWrapperTest.ElementWrapperTest element = new ElementWrapperTest();

            // Test
            JClassContainer container = createJClassContainer(element.getJClass(), "element");
            JMethod method = new JMethod("test", container, new XmlElementWrapperPlugin().runInternal(null));

            // Teardown
        }

    }