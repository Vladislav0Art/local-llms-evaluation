package graphql.annotations.processor.retrievers.fieldBuilders;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicMethods {

    public class PublicClass {
        private Method method;

        public void publicMethod() {
            // do something
        }

        public String getPublicVariable() {
            return "Hello";
        }
    }

    @Test
    public void testPublicMethods() throws Exception {
        Test test = new Test();
        Class<?> clazz = Test.class;
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (!method.getName().startsWith("get")) {
                try {
                    method.setAccessible(true);
                    Object instance = test.getClass().getMethod(methodName).invoke(instance);

                    System.out.println(method.invoke(instance));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        // Test getPublicVariable
        assertEquals("Hello", test.getPublicVariable());
    }

}