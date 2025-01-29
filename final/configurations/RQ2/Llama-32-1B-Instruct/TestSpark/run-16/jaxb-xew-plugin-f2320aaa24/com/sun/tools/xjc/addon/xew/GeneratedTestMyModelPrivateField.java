package com.sun.tools.xjc.addon.xew;

public class GeneratedTestMyModelPrivateField {

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
    public void testMyModelPrivateField() {
        MyModel model = new MyModel();
        model.setName("Alice");
        model.setAge(25);
        String name = model.getName();
        int age = model.getAge();

        assertEquals("Alice", name);
        assertEquals(25, age);
    }

}