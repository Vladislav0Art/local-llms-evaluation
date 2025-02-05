package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AnnotatedElement annotatedElementMock;

    @Mock
    private ProcessingElementsContainer processingElementsContainerMock;

    @Test
    public void buildTestWithNoException() {
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElementMock, processingElementsContainerMock);
        try {
            GraphQLDirective[] directives = builder.build();
            assertNotNull(directives);
        } catch (GraphQLAnnotationsException e) {
            fail("Exception was not expected to be thrown");
        }
    }

    @Test
    public void buildTestWithException() {
        when(annotatedElementMock.getDeclaredAnnotations()).thenThrow(new RuntimeException());
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElementMock, processingElementsContainerMock);
        builder.build();
    }

}