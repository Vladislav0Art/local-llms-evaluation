package com.sun.tools.xjc.addon.xew;

import com.google.common.collect.ImmutableMap;

public class GeneratedTestGetPrivateNameWithPrivateField {

    private String privateName;
    private int age;

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String name) {
        this.privateName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class GeneratedTest {

    @Test
    public void testGetPrivateNameWithPrivateField() {
        MyModel model = new MyModel();
        model.setPrivateName("Bob");
        assertEquals("Bob", model.getPrivateName());
        assertMyMethod("name_" + "_private");
    }

    public static void assertMyMethod(String methodName) {
        System.out.println("Testing " + methodName);
        try {
            MyModel model = new MyModel();
            Object result = model.getClass().getMethod(methodName).invoke(model);
            if (result == null) {
                throw new Exception("Expected non-null object");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        MyModel model2 = new MyModel();
        model2.setPrivateName("Bob");
        assertEquals("Bob", model2.getPrivateName());
    }

}