package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;

    @Test
    public void build_whenObjectAndContainerProvided_returnsGraphQLDirectiveArray() {
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainer = Mockito.mock(ProcessingElementsContainer.class);

        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();

        assertNotNull(graphQLDirectives);
    }

    @Test
    public void build_whenObjectAndContainerNotProvided_throwsException() {
        directivesBuilder = new DirectivesBuilder(null, null);
        directivesBuilder.build();
    }

}