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

public class GeneratedBuildNotFoundDirectiveTest {

    @Test
    public void buildNotFoundDirectiveTest() {
        Annotation annotation = Mockito.mock(Annotation.class);
        Method method = Mockito.mock(Method.class);
        Mockito.when(annotation.annotationType()).thenReturn((Class) method.getClass());

        ProcessingElementsContainer container = new ProcessingElementsContainer();
        container.setDirectiveRegistry(new HashMap<>());

        DirectivesBuilder builder = new DirectivesBuilder(annotation, container);
        builder.build();
    }

}