package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildWithMoreArgumentValuesThanSupportedTest {

    @Test
    public void buildWithMoreArgumentValuesThanSupportedTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        GraphQLDirective graphQLDirective = new GraphQLDirective("testName", "testDescription",
                Collections.emptyList(), Collections.emptyList());
        TypeSafeDirective typeSafeDirective = new TypeSafeDirective(graphQLDirective);
        when(container.getDirectiveRegistry().containsKey(anyString())).thenReturn(true);
        when(container.getDirectiveRegistry().get(anyString())).thenReturn(typeSafeDirective);

        GraphQLDirectives directives = Mockito.mock(GraphQLDirectives.class);
        when(directives.value()).thenReturn(new String[]{"1", "2", "3"});
        when(object.getAnnotation(GraphQLDirectives.class)).thenReturn(directives);

        new DirectivesBuilder(object, container).build();
    }

}