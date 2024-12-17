package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPublicClass {

    @Test
    public void testGetPublicClass() {
        String[] classNames = {"MyClass1", "MyClass2"};
        assertEquals(classNames.length, TestUtils.getPublicClassName().split("\\.")[0].length());
        for (String className : classNames) {
            if (className.startsWith("My")) {
                assertEquals(className.substring(3), TestUtils.getPublicClassName().substring(0, className.length() - 3));
            } else {
                assertEquals(className, TestUtils.getPublicClassName());
            }
        }
    }

}