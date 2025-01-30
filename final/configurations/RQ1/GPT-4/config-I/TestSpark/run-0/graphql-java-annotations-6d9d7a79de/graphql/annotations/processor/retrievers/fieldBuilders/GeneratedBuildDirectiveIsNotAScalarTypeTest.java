package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildDirectiveIsNotAScalarTypeTest {

    @Test
    public void buildDirectiveIsNotAScalarTypeTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        GraphQLDirective graphQLDirective = new GraphQLDirective("testName", "testDescription",
                Collections.emptyList(), Collections.emptyList());
        when(container.getDirectiveRegistry().containsKey(anyString())).thenReturn(true);
        when(container.getDirectiveRegistry().get(anyString())).thenReturn(graphQLDirective);

        new DirectivesBuilder(object, container).build();
    }

}