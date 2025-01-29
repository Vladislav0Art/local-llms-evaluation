package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void testAddAnnotation() {
        CommonUtils.addAnnotation(XmlElementWrapper.class, "testAnnotation");
    }

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annot = XmlElementWrapper.class.getAnnotation("testAnnotation");
        String value = (String) getAnnotationMemberValue(annot, "value");
        assertEquals("test-value", value);
    }

    @Test
    public void testCopyFields() {
        JClass jclass1 = jclass1(XmlElementWrapper.class, List.class);
        JAnnotatable annot = XmlElementWrapper.class.getAnnotation("testAnnotation");
        List<String> fields = (List<String>) getAnnotationFieldValue(annot, "fields");
        assertEquals("fields", fields.toString());
    }

    @Test
    public void testCopyFieldsWithConstructor() {
        JClass jclass1 = jclass1(XmlElementWrapper.class);
        String value = ((XmlElementWrapper) jclass1.newInstance()).test();
        assertEquals("value", value);
    }

    @Test
    public void testSetPrivateField() throws Exception {
        XmlElementWrapper xmlElementWrapper = new XmlElementWrapper();
        xmlElementWrapper.test();

        // Create a private field in the class and set it to true
        JClass jclass1 = jclass1(XmlElementWrapper.class);
        Field field = jclass1.getStaticDeclaredField("privateField", Boolean.class);
        field.setAccessible(true);
        field.set(xmlElementWrapper, true);

        // Check if the private field is accessible from outside the class
        Object fieldValue = ((XmlElementWrapper) jclass1.newInstance()).test();
        assertTrue(fieldValue instanceof Boolean);
    }

    @Test
    public void testGetPublicMethods() {
        JClass jclass1 = jclass(XmlElementWrapper.class, List.class);

        // Get a list of methods from the class
        Method[] methods = jclass1.getStaticDeclaredMethodList();

        // Check if the list is not empty
        assertTrue(methods.length > 0);
    }

    @Test
    public void testGetPublicMethodsWithConstructor() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a constructor from the class
        Method constructor = jclass1.getConstructors()[0];

        // Check if it is not empty
        assertTrue(constructor != null);
    }

    @Test
    public void testGetPublicMethodsWithStaticField() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a field from the class
        Field field = jclass1.getStaticDeclaredField("privateField", Boolean.class);

        // Check if it is not empty
        assertTrue(field != null);
    }

    @Test
    public void testGetPublicMethodsWithField() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a field from the class
        Field field = jclass1.getStaticDeclaredField("privateField", Boolean.class);

        // Check if it is not empty
        assertTrue(field != null);
    }

    @Test
    public void testGetPublicMethodsWithStaticDeclaredField() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a field from the class
        Field field = jclass1.getStaticDeclaredField("privateField", Boolean.class);

        // Check if it is not empty
        assertTrue(field != null);
    }

    @Test
    public void testGetPublicMethodsWithStaticMethod() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a method from the class
        Method method = jclass1.getStaticDeclaredMethod("test");

        // Check if it is not empty
        assertTrue(method != null);
    }

    @Test
    public void testGetPublicMethodsWithInstanceMethod() throws Exception {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get an instance method from the class
        Method method = jclass1.getMethod("test");

        // Check if it is not empty
        assertTrue(method != null);
    }

    @Test
    public void testGetPublicMethodsWithStaticMethodWithConstructor() {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a constructor from the class
        Method constructor = jclass1.getMethod("test", String[].class, int[].class);

        // Check if it is not empty
        assertTrue(constructor != null);
    }

    @Test
    public void testGetPublicMethodsWithStaticMethodWithConstructorAndFields() throws Exception {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a constructor from the class
        Method constructor = jclass1.getMethod("test", String[].class, int[].class);

        // Create an instance of the class and call the static method
        Object[] params = {new String[]{""}};
        Object result = jclass1.invoke(constructor, params);
        assertTrue(result instanceof Boolean);
    }

    @Test
    public void testGetPublicMethodsWithStaticMethodWithConstructorAndFieldsAndInstance() throws Exception {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a constructor from the class
        Method constructor = jclass1.getMethod("test", String[].class, int[].class);

        // Create an instance of the class and call the static method
        Object[] params = {new String[]{""}};
        Object result = jclass1.invoke(constructor, params);
        assertTrue(result instanceof Boolean);
    }

    @Test
    public void testGetPublicMethodsWithStaticMethodWithConstructorAndFieldsAndInstanceAndFields() throws Exception {
        JClass jclass1 = jclass(XmlElementWrapper.class);

        // Get a constructor from the class
        Method constructor = jclass1.getMethod("test", String[].class, int[].class);

        // Create an instance of the class and call the static method
        Object[] params = {new String[]{""}};
        Object result = jclass1.invoke(constructor, params);
        assertTrue(result instanceof Boolean);
    }

}