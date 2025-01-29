package com.sun.tools.xjc.addon.xew;

public class GeneratedTestMyModelPublicMethods {

    public String name = "";
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class MyModelTest {

    @Test
    public void testMyModelPublicMethods() {
        MyModel model = new MyModel();
        model.setName("John");
        model.setAge(30);
        assertEquals("John", model.getName());
        assertEquals(30, model.getAge());
    }

}