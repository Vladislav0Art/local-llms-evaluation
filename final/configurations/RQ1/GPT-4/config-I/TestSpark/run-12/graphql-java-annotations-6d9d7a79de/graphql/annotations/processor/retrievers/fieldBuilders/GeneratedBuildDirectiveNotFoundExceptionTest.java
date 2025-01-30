package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildDirectiveNotFoundExceptionTest {

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private GraphQLScalarType scalarType;

    @Test
    public void buildDirectiveNotFoundExceptionTest() {
        DirectivesBuilder builder = new DirectivesBuilder(MyClass1.class, container);
        when(container.getDirectiveRegistry()).thenReturn(Collections.emptyMap());
        assertThrows(GraphQLAnnotationsException.class, () -> builder.build());
    }

}