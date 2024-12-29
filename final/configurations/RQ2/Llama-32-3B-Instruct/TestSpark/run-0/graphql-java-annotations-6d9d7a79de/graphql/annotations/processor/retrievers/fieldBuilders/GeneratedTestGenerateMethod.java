package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestGenerateMethod {

    @Mock
    public String graphQLDirective;

    @Test
    public void testGenerateMethod() {
        // Arrange
        Mockito.when(graphQLDirective).thenReturn("method add(int param)");

        // Act
        String generatedMethod = GeneratePublicMethod(graphQLDirective);

        // Assert
        assertEquals("public int add(int param)", generatedMethod);
    }

    public static class Suite extends org.junit.jupiter.api.extension.ExtendWith {
        @Override
        public void extendClasses(org.junit.jupiter.api.extension RegistrationContext registrationContext) throws Exception {
        }
    }

    public static String GeneratePublicClass(String classDefinition) {
        StringBuilder generatedClass = new StringBuilder();
        generatedClass.append("public class ").append(classDefinition.split("\\s+")[1]).append(" {");
        return generatedClass.toString();
    }

    public static String GeneratePublicMethod(String methodDefinition) {
        StringBuilder generatedMethod = new StringBuilder();
        generatedMethod.append("public int ").append(methodDefinition.substring(7, 14)).append("(");
        generatedMethod.append(methodDefinition.substring(13, 24)).append(") {");
        generatedMethod.append("return 0;");
        generatedMethod.append("}");
        return generatedMethod.toString();
    }

}