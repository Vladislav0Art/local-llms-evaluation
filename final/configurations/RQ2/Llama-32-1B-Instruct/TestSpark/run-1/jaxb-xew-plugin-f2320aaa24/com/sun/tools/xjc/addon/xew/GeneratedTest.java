package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void testAddAnnotation() {
        JAnnotatable annot = new JAnnotatable();
        addAnnotation(annot, "custom", "X");
    }

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annot = new JAnnotatable();
        copyAnnotationMemberValue(annot, 1, "value");
    }

    @Test
    public void testCopyFields() {
        JClass clazz = getTestClass("com.sun.tools.xjc.addon.xew.TestXmlElementWrapperPlugin");
        List<JCField> fields = clazz.getDeclaredFields();
        Collection<JCField> copiedFields = new ArrayList<>();
        for (JCField field : fields) {
            copyFields(field, copiedFields);
        }
    }

    @Test
    public void testGenerableToString() {
        JAnnotatable annot = new JAnnotatable();
        generableToString(annot, "custom");
    }

    @Test
    public void testGetAnnotation() {
        JAnnotatable annot = new JAnnotatable();
        getAnnotation(annot, 1);
    }

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annot = new JAnnotatable();
        getAnnotationMemberValue(annot, 2);
    }

    @Test
    public void testGetAnnotationMemberWrapper() {
        JAnnotatable annot = new JAnnotatable();
        getAnnotationMember(annot, 3);
    }

    @Test
    public void testGetPrivateField() {
        JClass clazz = getTestClass("com.sun.tools.xjc.addon.xew.TestXmlElementWrapperPlugin");
        setPrivateField(clazz.getDeclaredFields(), "custom", "X");
    }

    @Test
    public void testGetXSDEclaration() {
        JAnnotatable annot = new JAnnotatable();
        getXSDEclaration(annot, 2);
    }

    @Test
    public void testHasPropertyNameCustomization() {
        JAnnotatable annot = new JAnnotatable();
        hasPropertyNameCustomization(annot, "custom");
    }

    @Test
    public void testHiddenClass() {
        JClass clazz = getTestClass("com.sun.tools.xjc.addon.xew.TestXmlElementWrapperPlugin");
        setPrivateField(clazz.getDeclaredFields(), "custom", "X");
    }

    @Test
    public void testIsListedAsParametrisation() {
        JAnnotatable annot = new JAnnotatable();
        isListedAsParametrisation(annot, 1);
    }

    @Test
    public void testSetPrivateField() {
        JClass clazz = getTestClass("com.sun.tools.xjc.addon.xew.TestXmlElementWrapperPlugin");
        setPrivateField(clazz.getDeclaredFields(), "custom", "X");
    }

    private static JClass getTestClass(String name) {
        // Replace with actual method to get class from package
        return null;
    }

}