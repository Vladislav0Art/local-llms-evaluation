package com.sun.tools.xjc.addon.xew;

public class GeneratedTestMyModelPublicSetter {

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
    public void testMyModelPublicSetter() {
        MyModel model = new MyModel();
        model.setName("Jane");
        model.setAge(20);

        // Test private setter
        model.setPrivateName("Jim");
        String getPrivateName = model.getPrivateName();
        assertEquals("Jim", getPrivateName);
    }

}