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
public class GeneratedBuildFieldWithAnnotationTest {

    @Mock
    private ProcessingElementsContainer mockContainer;

    @Mock
    private Field mockfield;

    @Test
    public void buildFieldWithAnnotationTest() {
        when(mockfield.getAnnotations()).thenReturn(new Annotation[]{
        @GraphQLDirectives(directives = Directives.ExampleDirective.class, method = "exampleMethod", location = Introspection.DirectiveLocation.FIELD)})
        ;
        DirectivesBuilder builder = new DirectivesBuilder(mockfield, mockContainer);
        GraphQLDirective[] graphqlDirective = builder.build();
        assertEquals(1, graphqlDirective.length);
        assertTrue(graphqlDirective[0] instanceof ExampleDirective);
    }

}