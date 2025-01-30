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

public class GeneratedTest {

    private static final GraphQLDirectiveContainer DIRECTIVE_CONTAINER_STUB = new GraphQLDirectiveContainer(null);

    @Test
    public void buildNoDirectivesTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = builder.build();
        assertEquals(0, directives.length);
    }

    @Test
    public void buildDirectiveInRegistryTest() {
        GraphQLDirective storedDirective = new GraphQLDirective("directive", "description", false, false, null, null, null);
        GraphQLDirectiveContainer storedDirectiveContainer = new GraphQLDirectiveContainer(storedDirective);
        Map<String, GraphQLDirectiveContainer> registryMap = new HashMap<>();
        registryMap.put("directive", storedDirectiveContainer);

        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        when(container.getDirectiveRegistry()).thenReturn(registryMap);

        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(1, directives.length);
    }

    @Test
    public void buildNoDirectiveInRegistryTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build();
    }

    @Test
    public void buildTooManyArgumentsTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build();
    }

}