package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedBuildDirectivesForMultipleTypesOfDirectives {

    @Test
    public void buildDirectivesForMultipleTypesOfDirectives() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        when(container.getJavaAnnotations()).thenReturn(Arrays.asList(GraphQLDirectives.ACTIVATION, GraphQLDirectives.OTHER));
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertEquals(1, directives.length);
    }

}