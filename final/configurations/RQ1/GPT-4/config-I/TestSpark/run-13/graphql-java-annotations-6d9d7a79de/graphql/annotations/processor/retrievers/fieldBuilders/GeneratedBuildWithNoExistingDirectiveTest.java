package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.mockito.Mockito;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.annotationTypes.GraphQLDirectiveDeclaration;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.GraphQLAnnotations;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithNoExistingDirectiveTest {

    @GraphQLDirectiveDeclaration(name = "testDirective")
    private class TestDirective implements Annotation {
        public Class<? extends Annotation> annotationType() {
            return TestDirective.class;
        }
    }

    static class ProcessingContainerMock extends ProcessingElementsContainer {
        public ProcessingContainerMock() {
            super(new HashMap<>(), new GraphQLAnnotations());
        }
    }

    @Test
    public void buildWithNoExistingDirectiveTest() {
        Method method = Mockito.mock(Method.class);
        ProcessingElementsContainer container = new ProcessingContainerMock();
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        when(method.getAnnotations()).thenReturn(new Annotation[]{new TestDirective()});

        builder.build();
    }

}