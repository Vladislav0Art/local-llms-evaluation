package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.typeBuilders.TypeAndWiring;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLFieldDefinition;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String directiveName = "TestDirective";
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        TypeAndWiring directiveTypeAndWiring = mock(TypeAndWiring.class);
        when(directiveTypeAndWiring.getWiring()).thenReturn(null);
        when(directiveTypeAndWiring.getType()).thenReturn(GraphQLFieldDefinition.Builder.newFieldDefinition().build());
        Map<String, TypeAndWiring> mappedDirectives = new HashMap<>();
        mappedDirectives.put(directiveName, directiveTypeAndWiring);
        when(container.getDirectiveRegistry()).thenReturn(mappedDirectives);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] builtDirectives = builder.build();
        assertThat(builtDirectives, is(notNullValue()));
    }

}