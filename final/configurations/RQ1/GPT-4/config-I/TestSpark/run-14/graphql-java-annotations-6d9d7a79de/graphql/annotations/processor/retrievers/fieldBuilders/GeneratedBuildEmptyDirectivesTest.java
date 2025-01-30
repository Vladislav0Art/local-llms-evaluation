package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static graphql.schema.GraphQLArgument.newArgument;
import static graphql.schema.GraphQLDirective.newDirective;
import static graphql.schema.GraphQLScalarType.newScalar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildEmptyDirectivesTest {

    @Test
    public void buildEmptyDirectivesTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = directivesBuilder.build();
        assertEquals(0, result.length);
    }

}