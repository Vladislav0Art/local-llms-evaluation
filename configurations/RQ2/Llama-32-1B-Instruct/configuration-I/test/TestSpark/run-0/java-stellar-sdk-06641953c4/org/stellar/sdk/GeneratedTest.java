package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testGeneratePublicClassAndMethod() throws Exception {
        // Create public class and method
        Class<?> clazz = new TestClass();
        Method publicMethod = null;

        // Generate the code for public class
        String publicCode = generatePublicClass(clazz);

        // Generate the code for public method
        String publicMethodCode = generatePublicMethod(publicMethod, clazz);

        System.out.println("Generated public code:");
        System.out.println(publicCode);
    }

    @Test
    public void testGeneratePublicClassAndMethodWithDecorator() throws Exception {
        // Create public class and method with decorator
        Class<?> clazz = new TestClassWithDecorators();
        Method publicMethod = null;

        // Generate the code for public class
        String publicCode = generatePublicClass(clazz);

        // Generate the code for public method
        String publicMethodCode = generatePublicMethod(publicMethod, clazz);

        System.out.println("Generated public code:");
        System.out.println(publicCode);
    }

    @Test
    public void testGeneratePublicClassAndMethodWithPayloadDecorators() throws Exception {
        // Create public class and method with payload decorators
        Class<?> clazz = new TestClassWithPayloadDecorators();
        Method publicMethod = null;

        // Generate the code for public class
        String publicCode = generatePublicClass(clazz);

        // Generate the code for public method
        String publicMethodCode = generatePublicMethod(publicMethod, clazz);

        System.out.println("Generated public code:");
        System.out.println(publicCode);
    }

    @Test
    public void testGeneratePublicMethodAndDecorator() throws Exception {
        // Create public class and method with decorator
        Class<?> clazz = new TestClassWithDecorators();
        Method publicMethod = null;

        // Generate the code for public method
        String publicMethodCode = generatePublicMethod(publicMethod, clazz);

        System.out.println("Generated public method code:");
        System.out.println(publicMethodCode);
    }

    @Test
    public void testGeneratePrivateClassAndMethod() throws Exception {
        // Create private class and method
        Class<?> clazz = new TestClass();
        Method privateMethod = null;

        // Generate the code for private method
        String privateMethodCode = generatePrivateMethod(privateMethod, clazz);

        System.out.println("Generated private method code:");
        System.out.println(privateMethodCode);
    }

    @Test
    public void testGeneratePrivateClassAndMethodWithDecorator() throws Exception {
        // Create private class and method with decorator
        Class<?> clazz = new TestClass();
        Method privateMethod = null;

        // Generate the code for private method
        String privateMethodCode = generatePrivateMethod(privateMethod, clazz);

        System.out.println("Generated private method code:");
        System.out.println(privateMethodCode);
    }

    @Test
    public void testGeneratePrivateMethodAndDecorator() throws Exception {
        // Create private class and method with decorator
        Class<?> clazz = new TestClass();
        Method privateMethod = null;

        // Generate the code for private method
        String privateMethodCode = generatePrivateMethod(privateMethod, clazz);

        System.out.println("Generated private method code:");
        System.out.println(privateMethodCode);
    }

    private String generatePublicClass(Class<?> clazz) throws Exception {
        StringBuilder publicCode = new StringBuilder();
        try (PrintWriter writer = new PrintWriter(System.out)) {
            // Generate class and methods
            writeClass(clazz, writer);
        }
        return publicCode.toString();
    }

    private void writeClass(Class<?> clazz, PrintWriter writer) throws Exception {
        for (java.lang.reflect.Method method : clazz.getMethods()) {
            String methodName = method.getName();
            if (!isPrivate(methodName)) {
                String body = writeMethod(writer, method);
                writer.println(body);
            }
        }
    }

    private boolean isPrivate(String methodName) {
        return methodName.startsWith("__") && !methodName.endsWith("__");
    }

    private String generatePublicMethod(Method method, Class<?> clazz) throws Exception {
        StringBuilder publicCode = new StringBuilder();
        try (PrintWriter writer = new PrintWriter(System.out)) {
            // Generate method
            writeMethod(writer, method);
            // Add return statement if necessary
            if (!method.isPrimitive() && !isPrivate(methodName)) {
                String body = generateReturnStatement(method, clazz);
                writer.println(body);
            }
        }
        return publicCode.toString();
    }

    private void writeMethod(PrintWriter writer, Method method) throws Exception {
        for (java.lang.reflect.Parameter parameter : method.getParameters()) {
            String paramName = parameter.getName();
            if (!isPrivate(paramName)) {
                String body = writeParameter(writer, parameter);
                writer.println(body);
            }
        }
    }

    private boolean isPrivate(String methodName) {
        return methodName.startsWith("__") && !methodName.endsWith("__");
    }

    private String generatePrivateMethod(Method method, Class<?> clazz) throws Exception {
        StringBuilder privateCode = new StringBuilder();
        try (PrintWriter writer = new PrintWriter(System.out)) {
            // Generate method
            writeMethod(writer, method);
            // Add return statement if necessary
            if (!method.isPrimitive() && !isPrivate(methodName)) {
                String body = generateReturnStatement(method, clazz);
                writer.println(body);
            }
        }
        return privateCode.toString();
    }

    private void writeParameter(PrintWriter writer, java.lang.reflect.Parameter parameter) throws Exception {
        // For this test case, we don't have any parameters to print
    }

    private String generatePrivateMethodWithDecorator(Method method, Class<?> clazz) throws Exception {
        StringBuilder privateCode = new StringBuilder();
        try (PrintWriter writer = new PrintWriter(System.out)) {
            // Generate method with decorator
            writeMethod(writer, method);
            // Add return statement if necessary
            if (!method.isPrimitive() && !isPrivate(methodName)) {
                String body = generateReturnStatementWithDecorator(method, clazz);
                writer.println(body);
            }
        }
        return privateCode.toString();
    }

    private void writeMethod(PrintWriter writer, Method method) throws Exception {
        for (java.lang.reflect.Parameter parameter : method.getParameters()) {
            String paramName = parameter.getName();
            if (!isPrivate(paramName)) {
                String body = writeParameter(writer, parameter);
                writer.println(body);
            }
        }
    }

    private String generateReturnStatement(Method method, Class<?> clazz) throws Exception {
        StringBuilder returnCode = new StringBuilder();
        try (PrintWriter writer = new PrintWriter(System.out)) {
            // Generate return statement
            if (!method.isPrimitive()) {
                String body = writeReturnValue(writer, method);
                writer.println(body);
            }
        }
        return returnCode.toString();
    }

    private void writeMethodWithDecorator(PrintWriter writer, Method method) throws Exception {
        for (java.lang.reflect.Parameter parameter : method.getParameters()) {
            String paramName = parameter.getName();
            if (!isPrivate(paramName)) {
                String body = writeParameter(writer, parameter);
                writer.println(body);
            }
        }
    }

    private String generateReturnStatementWithDecorator(Method method, Class<?> clazz) throws Exception {
        StringBuilder returnCode = new StringBuilder();
        try (PrintWriter writer = new PrintWriter(System.out)) {
            // Generate return statement with decorator
            if (!method.isPrimitive()) {
                String body = writeReturnValue(writer, method);
                writer.println(body);
            }
        }
        return returnCode.toString();
    }

    private void writeReturnStatement(PrintWriter writer, Method method) throws Exception {
        for (java.lang.reflect.Parameter parameter : method.getParameters()) {
            String paramName = parameter.getName();
            if (!isPrivate(paramName)) {
                String body = writeParameter(writer, parameter);
                writer.println(body);
            }
        }
    }

    private String generateReturnStatement(Method method, Class<?> clazz) throws Exception {
        StringBuilder returnCode = new StringBuilder();
        try (PrintWriter writer = new PrintWriter(System.out)) {
            // Generate return statement
            if (!method.isPrimitive()) {
                String body = writeReturnValue(writer, method);
                writer.println(body);
            }
        }
        return returnCode.toString();
    }

    private void writeReturnValue(PrintWriter writer, Method method) throws Exception {
        for (java.lang.reflect.Parameter parameter : method.getParameters()) {
            String paramName = parameter.getName();
            if (!isPrivate(paramName)) {
                StringBuilder body = new StringBuilder();
                // For this test case, we don't have any return values to print
                body.append("return value;").append("\n");
                writer.println(body.toString());
            }
        }
    }

    private String generateReturnStatement(Class<?> clazz) throws Exception {
        StringBuilder returnCode = new StringBuilder();
        try (PrintWriter writer = new PrintWriter(System.out)) {
            // Generate return statement for all methods in the class
            for (java.lang.reflect.Method method : clazz.getMethods()) {
                if (!method.isPrimitive() && !isPrivate(method.getName())) {
                    String body = writeReturnValue(writer, method);
                    writer.println(body);
                }
            }
        }
        return returnCode.toString();
    }

    private void writeParameter(PrintWriter writer, java.lang.reflect.Parameter parameter) throws Exception {
        // For this test case, we don't have any parameters to print
    }

}