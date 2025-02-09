package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedBuildMethod_Test_WhenDirectivesArePresent {

    @Test
    public void buildMethod_Test_WhenDirectivesArePresent() {
        // given
        DirectiveJavaAnnotationUtil utilMock = Mockito.mock(DirectiveJavaAnnotationUtil.class);
        ProcessingElementsContainer containerMock = Mockito.mock(ProcessingElementsContainer.class);
        when(containerMock.getDirectiveJavaAnnotationUtil()).thenReturn(utilMock);
        when(utilMock.getDirectiveInfo(any(), any())).thenReturn(new GraphQLDirective[]{});

        DirectivesBuilder builder = new DirectivesBuilder(SomeClassWithDirectives.class, containerMock);

        // when
        GraphQLDirective[] result = builder.build();

        // then
        assertNotNull(result);
        assertEquals(0, result.length);
    }

}