package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class GeneratedTransformArgsMoreValuesThanArgsTest {

    @Test
    public void transformArgsMoreValuesThanArgsTest() {
        Annotation annotation = Mockito.mock(Annotation.class);
        Method[] runningMethods = new Method[]{Mockito.mock(Method.class), Mockito.mock(Method.class)};
        Mockito.when(annotation.annotationType()).thenReturn((Class) runningMethods.getClass());

        ProcessingElementsContainer container = new ProcessingElementsContainer();
        GraphQLDirective directive = GraphQLDirective.newDirective()
                .name("sampleDirective")
                .validLocations(Introspection.DirectiveLocation.FIELD)
                .build();
        String[] argValues = new String[]{"val1", "val2", "val3"};
        DirectivesBuilder builder = new DirectivesBuilder(annotation, container);
        builder.transformArgs(directive, argValues);
    }

}