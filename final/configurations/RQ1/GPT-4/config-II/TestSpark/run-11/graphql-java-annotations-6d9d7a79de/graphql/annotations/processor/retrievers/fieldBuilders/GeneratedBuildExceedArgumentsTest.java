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

public class GeneratedBuildExceedArgumentsTest {

    @Test
    public void buildExceedArgumentsTest() {
        Annotation annotation = Mockito.mock(Annotation.class);

        Method[] methods = new Method[]{Mockito.mock(Method.class)};
        Mockito.when(annotation.annotationType()).thenReturn((Class) methods.getClass());

        ProcessingElementsContainer container = new ProcessingElementsContainer();
        container.setDirectiveRegistry(new HashMap<>());

        DirectivesBuilder builder = new DirectivesBuilder(annotation, container);
        builder.build();
    }

}