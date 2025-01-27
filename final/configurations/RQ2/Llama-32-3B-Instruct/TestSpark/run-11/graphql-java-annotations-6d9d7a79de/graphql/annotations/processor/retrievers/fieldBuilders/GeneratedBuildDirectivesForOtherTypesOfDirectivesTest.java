package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedBuildDirectivesForOtherTypesOfDirectivesTest {

    @Test
    public void buildDirectivesForOtherTypesOfDirectivesTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        when(container.getJavaAnnotations()).thenReturn(Arrays.asList(GraphQLDirectives.OTHER));
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertTrue(directives.length == 0);
    }

}