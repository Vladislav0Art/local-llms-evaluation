package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedBuildDirectivesForActivationDirectiveWithArgumentAndType {

    @Test
    public void buildDirectivesForActivationDirectiveWithArgumentAndType() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        when(container.getJavaAnnotations()).thenReturn(Arrays.asList(GraphQLDirectives.ACTIVATION, new GraphQLArgument(), new GraphQLScalarType()));
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertEquals(1, directives.length);
    }

}