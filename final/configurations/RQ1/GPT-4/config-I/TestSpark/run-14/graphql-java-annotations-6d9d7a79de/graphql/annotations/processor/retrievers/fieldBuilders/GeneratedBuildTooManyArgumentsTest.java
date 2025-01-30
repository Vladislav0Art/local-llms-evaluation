package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;
import java.util.Map;

import static graphql.schema.GraphQLDirective.newDirective;
import static graphql.schema.GraphQLScalarType.newScalar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildTooManyArgumentsTest {

    private static final GraphQLDirectiveContainer DIRECTIVE_CONTAINER_STUB = new GraphQLDirectiveContainer(null);

    @Test
    public void buildTooManyArgumentsTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build();
    }

}