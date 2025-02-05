package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Arrays;

public class GeneratedBuildWithDirectiveTest {

    @Test
    public void buildWithDirectiveTest() throws Exception {
        Method method = MyClass.class.getMethod("methodWithDirective");
        ProcessingElementsContainer mockContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(method, mockContainer);
        GraphQLDirective[] directives = builder.build();
        assertEquals(1, directives.length);
        assertEquals("MyDirective", directives[0].getName());
    }

}