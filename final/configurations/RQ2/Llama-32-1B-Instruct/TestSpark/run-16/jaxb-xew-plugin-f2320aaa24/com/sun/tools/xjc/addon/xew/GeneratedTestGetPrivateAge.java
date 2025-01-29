package com.sun.tools.xjc.addon.xew;

import com.google.common.collect.ImmutableMap;

public class GeneratedTestGetPrivateAge {

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
    public void testGetPrivateAge() {
        MyModel model = new MyModel();
        assertEquals(25, model.getAge());
    }

}