package com.crowdin.client.core.http.impl.json;

public class GeneratedTestGenerated {

    public static class Test {
        public void addMethod(Method1 method1) {
        }

        public void addMethod(Method2 method2) {
        }
    }

    @Test
    public void testGenerated() {
        Test test = new Test();
        Method1 method1 = new Method1();
        Method2 method2 = new Method2();

        test.addMethod(method1);
        test.addMethod(method2);
    }
}

class Method1 {
    public String method1() {
        return "Test 1";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Method1 method1 = (Method1) obj;
        return this.method1.equals(method1.method1());
    }
}

class Method2 {
    public String method2() {
        return "Test 2";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Method2 method2 = (Method2) obj;
        return this.method2.equals(method2.method2());
    }

}