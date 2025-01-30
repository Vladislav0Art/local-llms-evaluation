package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
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
import java.util.Map;

import static graphql.schema.GraphQLScalarType.newScalar;

public class GeneratedBuildDirectiveNotInRegistryTest {

    @Test
    public void buildDirectiveNotInRegistryTest() {
        Method mockObject = Mockito.mock(Method.class);
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);

        Annotation[] annotations = new Annotation[]{Mockito.mock(Annotation.class)};
        Mockito.when(mockObject.getDeclaredAnnotations()).thenReturn(annotations);

        DirectivesBuilder builder = new DirectivesBuilder(mockObject, mockContainer);

        builder.build();
    }

}