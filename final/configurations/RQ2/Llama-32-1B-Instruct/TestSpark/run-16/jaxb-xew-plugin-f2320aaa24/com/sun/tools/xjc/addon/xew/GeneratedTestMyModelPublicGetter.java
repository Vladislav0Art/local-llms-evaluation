package com.sun.tools.xjc.addon.xew;

public class GeneratedTestMyModelPublicGetter {

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
    public void testMyModelPublicGetter() {
        MyModel model = new MyModel();
        model.setName("Bob");
        model.setAge(35);
        String name = model.getName();
        int age = model.getAge();

        assertEquals("Bob", name);
        assertEquals(35, age);

        // Test private getter
        String getPrivateName = model.getPrivateName();
        assertEquals("Bob", getPrivateName);

        // Test public setter for private field
        model.setPrivateName("Charlie");
        String getNameWithPrivateField = model.getNameWithPrivateField();
        assertEquals("Charlie", getNameWithPrivateField);
    }

}