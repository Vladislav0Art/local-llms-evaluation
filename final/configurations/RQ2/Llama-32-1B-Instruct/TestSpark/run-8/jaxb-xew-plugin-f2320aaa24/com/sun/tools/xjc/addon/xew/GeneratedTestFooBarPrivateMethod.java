package com.sun.tools.xjc.addon.xew;

import java.lang.reflect.Method;

public class GeneratedTestFooBarPrivateMethod {

    @Test
    public void testFooBarPrivateMethod() throws Exception {
        TestGenerator.main(new String[]{"test.bar(TestMethodTest.class, $1)($2)", new Object[]{"$3"}});
    }
}

class TestMethodMain extends TestSparkTestMain {
    private TestTestClass testClass;

    @Override
    public Class<?>[] getTestClassArray() throws Exception {
        return new Class<?>[]{TestClass.class};
    }

    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
    }

}