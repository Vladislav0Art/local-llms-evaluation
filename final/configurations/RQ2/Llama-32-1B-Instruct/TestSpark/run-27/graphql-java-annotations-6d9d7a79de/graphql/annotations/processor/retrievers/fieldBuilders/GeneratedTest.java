package graphql.annotations.processor.retrievers.fieldBuilders;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public static class PublicClass {
        private String publicVariable = "Hello";

        public void testPublicMethods() throws Exception {
            PublicClass instance = new PublicClass();
            System.out.println(instance.publicVariable);
        }

        public String getPublicVariable() {
            return publicVariable;
        }
    }

    @Test
    public void testPublicMethods1() throws Exception {
        Test test = new Test();
        Method[] methods = test.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (!method.getName().startsWith("get")) {
                try {
                    test.getClass().getMethod(methodName).setAccessible(true);
                    Object instance = test.getClass().getMethod(methodName).invoke(instance);

                    System.out.println(test.getClass().getMethod(methodName).invoke(instance));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        // Test getPublicVariable
        assertEquals("Hello", PublicClass.PublicClass.getPublicVariable());
    }

    @Test
    public void testPublicMethods2() throws Exception {
        Test test = new Test();
        Method[] methods = test.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (!method.getName().startsWith("get")) {
                try {
                    test.getClass().getMethod(methodName).setAccessible(true);
                    Object instance = test.getClass().getMethod(methodName).invoke(instance);

                    System.out.println(test.getClass().getMethod(methodName).invoke(instance));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        // Test getPublicVariable
        assertEquals("Hello", PublicClass.PublicClass.getPublicVariable());
    }

}