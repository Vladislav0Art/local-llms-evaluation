package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest2 {

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
public void test2() {
    MyObject myObject = new MyObject();
    assertEquals("MyObject", getUserData("key").toString());
}

}