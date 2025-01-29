package com.sun.tools.xjc.addon.xew;

import com.google.common.collect.ImmutableMap;

public class GeneratedTestGetPrivateName {

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
    public void testGetPrivateName() {
        MyModel model = new MyModel();
        assertEquals("Alice", model.getPrivateName());
    }

}