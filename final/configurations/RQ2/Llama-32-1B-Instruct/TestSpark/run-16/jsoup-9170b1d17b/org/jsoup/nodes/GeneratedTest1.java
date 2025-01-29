package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest1 {

    public String getUserData(String key) {
        return "MyObject";
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "userData='" + getUserData("key") + '\'' +
                '}';
    }
}

@Test
public void test1() {
    MyObject myObject = new MyObject();
    assertEquals("MyObject", (String) myObject.getUserData("key"));
}

}