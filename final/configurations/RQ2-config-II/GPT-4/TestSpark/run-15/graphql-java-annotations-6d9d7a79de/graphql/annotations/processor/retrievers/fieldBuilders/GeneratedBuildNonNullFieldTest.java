package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;

import java.lang.reflect.Field;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildNonNullFieldTest {

    @Mock
    private ProcessingElementsContainer mockContainer;

    @Mock
    private Field mockfield;

    @Test
    public void buildNonNullFieldTest() {
        when(mockfield.getAnnotations()).thenReturn(new Annotation[]{ @GraphQLNonNull});
        DirectivesBuilder builder = new DirectivesBuilder(mockfield, mockContainer);
        GraphQLDirective[] graphqlDirective = builder.build();
        assertTrue(graphqlDirective[0] instanceof NonNullDirective);
    }

}