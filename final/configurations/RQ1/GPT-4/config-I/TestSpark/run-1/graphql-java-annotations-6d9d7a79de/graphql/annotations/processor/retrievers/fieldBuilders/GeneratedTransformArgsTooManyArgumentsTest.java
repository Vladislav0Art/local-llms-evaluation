package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class GeneratedTransformArgsTooManyArgumentsTest {

    @Test
    public void transformArgsTooManyArgumentsTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        Field field = Mockito.mock(Field.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Method method = Mockito.mock(Method.class);
        Mockito.when(directive.getArguments()).thenReturn(Collections.emptyList());
        Mockito.when(annotation.annotationType().getDeclaredMethods()).thenReturn(new Method[]{method});
        directivesBuilder.transformArgs(directive, annotation);
    }

}