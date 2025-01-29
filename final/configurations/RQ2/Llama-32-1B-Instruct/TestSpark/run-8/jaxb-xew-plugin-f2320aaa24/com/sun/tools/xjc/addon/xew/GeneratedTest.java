package com.sun.tools.xjc.addon.xew;

import java.lang.reflect.Method;

public class GeneratedTest {

    @Test
    public void testFooBarPublicMethod() throws Exception {
        TestGenerator.main(new String[]{"test.foo(TestGenerator.class, "bar")"});
    }

    @Test
    public void testFooBarPrivateMethod() throws Exception {
        TestGenerator.main(new String[]{"test.bar(TestMethodTest.class, $1)($2)", new Object[]{"$3"}});
    }
}

class TestSparkTest extends TestGeneratorTest {
    private TestClass testClass;

    @Override
    public Class<?>[] getTestClassArray() throws Exception {
        return new Class<?>[]{TestClass.class};
    }

    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
    }

    @Test
    public void testFooBarPublicMethod() throws Exception {
        TestGenerator.main(new String[]{"test.foo(TestSparkTest.class, $1)($2)", new Object[]{"$3"}});
    }

    @Test
    public void testFooBarPrivateMethod() throws Exception {
        TestGenerator.main(new String[]{"test.bar(TestMethodMain.class, $1)($2)", new Object[]{"$3"}});
    }
}

class TestSparkTestMain extends TestSparkTest {
    private TestClass testClass;

    @Override
    public Class<?>[] getTestClassArray() throws Exception {
        return new Class<?>[]{TestClass.class};
    }

    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
    }

    @Test
    public void testFooBarPublicMethod() throws Exception {
        TestGenerator.main(new String[]{"test.foo(TestSparkTestMain.class, $1)($2)", new Object[]{"$3"}});
    }
}

class TestTestClass {
    private int foo;

    public int getFoo() {
        return this.foo;
    }

    @Test
    public void bar() {
        System.out.println("Bar method executed");
    }
}

@Test
public void testFooBarPublicMethod() throws Exception {
    TestGenerator.main(new String[]{"test.foo(TestGenerator.class, $1)($2)", new Object[]{"$3"}});
}

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

    @Test
    public void testFooBarPublicMethod() throws Exception {
        TestGenerator.main(new String[]{"test.foo(TestSparkTestMain.class, $1)($2)", new Object[]{"$3"}});
    }

}