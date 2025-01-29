package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

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

    @Test
    public void testCopyFieldValue() {
        // Setup
        ElementWrapperTest.ElementWrapperTest element = new ElementWrapperTest();

        // Test
        JClassContainer container = createJClassContainer(element.getJClass(), "element");
        JMethod method = new JMethod("test", container, new XmlElementWrapperPlugin().runInternal(null));

        // Teardown
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

    @Test
    public void testGetPrivateField() {
        // Setup
        ElementWrapperTest.ElementWrapperTest element = new ElementWrapperTest();

        // Test
        JClassContainer container = createJClassContainer(element.getJClass(), "element");
        JFieldVar field = (JFieldVar) container getField(field);

        // Teardown
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