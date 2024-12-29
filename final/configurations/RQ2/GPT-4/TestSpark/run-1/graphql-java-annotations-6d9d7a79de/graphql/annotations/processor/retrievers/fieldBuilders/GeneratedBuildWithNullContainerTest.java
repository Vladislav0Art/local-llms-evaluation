package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.AnnotatedElement;

public class GeneratedBuildWithNullContainerTest {

    @Test
    public void buildWithNullContainerTest() {
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, null);

        directivesBuilder.build();
    }

}