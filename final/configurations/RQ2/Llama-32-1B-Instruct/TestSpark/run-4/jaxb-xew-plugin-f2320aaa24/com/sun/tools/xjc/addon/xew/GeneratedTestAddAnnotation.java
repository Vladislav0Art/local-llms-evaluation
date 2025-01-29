package com.sun.tools.xjc.addon.xew;

public class GeneratedTestAddAnnotation {

    public static class ElementWrapperTest {
        @Before
        void setUp() {
        }

        @Test
        public void testAddAnnotation() {
            // Setup
            JAnnotatable annotatable = createJAnnotatable();
            JClassContainer container = createJClassContainer(annotatable, "element");
            JAnnotationArrayMember annotation = new JAnnotationArrayMember();
            JAnnotationUse use = new JAnnotationUse(annotation);
            JMethod method = new JMethod("test", container, use);

            // Test
            method.setAnnotation(getAnnotation(method));

            // Teardown
        }

        public static JAnnotatable createJAnnotatable() {
            return new XmlElementWrapperPlugin().runInternal(null).getAnnotations();
        }
    }

}