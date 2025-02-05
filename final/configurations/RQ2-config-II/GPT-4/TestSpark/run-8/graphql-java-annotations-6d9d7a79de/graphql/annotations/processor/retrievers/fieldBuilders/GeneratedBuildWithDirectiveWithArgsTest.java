package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithDirectiveWithArgsTest {

    @Mock
    private AnnotatedElement object;
    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildWithDirectiveWithArgsTest() {
        when(object.isAnnotationPresent(GraphQLDirectives.class)).thenReturn(true);
        when(container.getDirective(argument.getReturnTypeName())).thenReturn(mock(GraphQLDirective.class));
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = builder.build();
        assertEquals(1, directives.length);
        verify(object, times(1)).getAnnotations();
        verify(container, times(1)).getDirective(argument.getReturnTypeName());
    }

}