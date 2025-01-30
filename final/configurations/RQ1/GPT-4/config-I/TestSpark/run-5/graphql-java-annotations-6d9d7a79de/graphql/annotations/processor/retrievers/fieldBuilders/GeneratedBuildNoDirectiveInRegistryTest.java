package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.annotationTypes.directives.DirectiveLocations;
import graphql.annotations.annotationTypes.directives.definition.DirectiveDefinition;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildNoDirectiveInRegistryTest {

    @DirectiveDefinition(directive = @Directive(name = "d", locations = {}))

    @Test
    public void buildNoDirectiveInRegistryTest() {
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        Field object = mock(Field.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        when(container.getDirectiveRegistry()).thenReturn(Collections.emptyMap());
        builder.build();
    }

    @DirectiveDefinition(directive = @Directive(name = "d", locations = {
    }
}