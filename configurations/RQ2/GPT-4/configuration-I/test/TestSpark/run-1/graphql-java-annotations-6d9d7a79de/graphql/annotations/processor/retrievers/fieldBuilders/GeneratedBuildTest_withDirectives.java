package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.GraphQLDirective;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildTest_withDirectives {

    @Test
    public void buildTest_withDirectives() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Mockito.when(container.getDirective(Mockito.any())).thenReturn(directive);
        GraphQLDirective[] result = directivesBuilder.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(directive, result[0]);
    }

}