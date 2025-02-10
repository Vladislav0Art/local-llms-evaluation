package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.List;

public class GeneratedBuildDirectivesBuilderWithFieldAndArgsAndDirectiveAnnotation_ReturnsCorrectDirectiveArray {

    @Test
    public void buildDirectivesBuilderWithFieldAndArgsAndDirectiveAnnotation_ReturnsCorrectDirectiveArray() throws Exception {
        java.lang.reflect.Field field = java.lang.reflect.Method.class;
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, null);
        Method getMethods = field.getClass().getMethod("getMethods");
        List<Method> methods = (List<Method>) getMethods.invoke(field);
        GraphQLDirective[] result = directivesBuilder.build();
        assertEquals(methods.size(), result.length);
    }

}