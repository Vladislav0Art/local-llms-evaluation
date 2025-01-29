package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest4 {

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
public void test4() {
    MyObject myObject = new MyObject();
    Object value = myObject.getUserData("key");
    assertEquals(value, "MyObject");
}

}