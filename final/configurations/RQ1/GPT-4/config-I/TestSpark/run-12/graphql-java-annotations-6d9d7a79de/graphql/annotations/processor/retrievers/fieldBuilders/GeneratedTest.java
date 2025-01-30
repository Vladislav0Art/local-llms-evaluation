package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private GraphQLScalarType scalarType;

    @Test
    public void buildDirectiveNotFoundExceptionTest() {
        when(container.getDirectiveRegistry()).thenReturn(Collections.emptyMap());
        assertThrows(GraphQLAnnotationsException.class, () -> builder.build());
    }

}