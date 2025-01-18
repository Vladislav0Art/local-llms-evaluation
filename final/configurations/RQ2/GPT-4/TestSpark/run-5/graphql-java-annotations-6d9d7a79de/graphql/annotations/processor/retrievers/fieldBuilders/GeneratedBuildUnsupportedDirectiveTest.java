package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.mockito.Mockito.when;

public class GeneratedBuildUnsupportedDirectiveTest {

    @Test
    public void buildUnsupportedDirectiveTest() {
        Method method = MyClass.class.getDeclaredMethods()[0];
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, container);
        directivesBuilder.build();
    }

    // Mocked Class and Method for test cases
    private class MyClass {
        @GraphQLDirectives(value = {})
        private String noDirectivesField;

        @UnsupportedDirectiveAnnotation
        private String unsupportedDirectiveMethod() {
            return "";
        }
    }

}