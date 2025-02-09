package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;

import java.lang.reflect.Method;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithInvalidDirectivesTest {

    @Mock
    private Method method;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildWithInvalidDirectivesTest() {
        when(method.isAnnotationPresent(GraphQLDirectives.class)).thenReturn(true);
        GraphQLDirectives directives = mock(GraphQLDirectives.class);
        when(method.getAnnotation(GraphQLDirectives.class)).thenReturn(directives);
        when(directives.value()).thenThrow(new GraphQLAnnotationsException("Invalid directive"));

        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] result = builder.build();

        assertEquals(0, result.length);
    }

}