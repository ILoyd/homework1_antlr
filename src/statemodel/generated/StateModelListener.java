// Generated from C:/repos/homework1_antlr/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateModelParser}.
 */
public interface StateModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(StateModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(StateModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#statesBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatesBlock(StateModelParser.StatesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#statesBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatesBlock(StateModelParser.StatesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#stateDef}.
	 * @param ctx the parse tree
	 */
	void enterStateDef(StateModelParser.StateDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#stateDef}.
	 * @param ctx the parse tree
	 */
	void exitStateDef(StateModelParser.StateDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#stateLabels}.
	 * @param ctx the parse tree
	 */
	void enterStateLabels(StateModelParser.StateLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#stateLabels}.
	 * @param ctx the parse tree
	 */
	void exitStateLabels(StateModelParser.StateLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionsBlock}.
	 * @param ctx the parse tree
	 */
	void enterTransitionsBlock(StateModelParser.TransitionsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionsBlock}.
	 * @param ctx the parse tree
	 */
	void exitTransitionsBlock(StateModelParser.TransitionsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionElement}.
	 * @param ctx the parse tree
	 */
	void enterTransitionElement(StateModelParser.TransitionElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionElement}.
	 * @param ctx the parse tree
	 */
	void exitTransitionElement(StateModelParser.TransitionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#schemaDef}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDef(StateModelParser.SchemaDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#schemaDef}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDef(StateModelParser.SchemaDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionDef}.
	 * @param ctx the parse tree
	 */
	void enterTransitionDef(StateModelParser.TransitionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionDef}.
	 * @param ctx the parse tree
	 */
	void exitTransitionDef(StateModelParser.TransitionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#isInitial}.
	 * @param ctx the parse tree
	 */
	void enterIsInitial(StateModelParser.IsInitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#isInitial}.
	 * @param ctx the parse tree
	 */
	void exitIsInitial(StateModelParser.IsInitialContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#stateName}.
	 * @param ctx the parse tree
	 */
	void enterStateName(StateModelParser.StateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#stateName}.
	 * @param ctx the parse tree
	 */
	void exitStateName(StateModelParser.StateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#isError}.
	 * @param ctx the parse tree
	 */
	void enterIsError(StateModelParser.IsErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#isError}.
	 * @param ctx the parse tree
	 */
	void exitIsError(StateModelParser.IsErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(StateModelParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(StateModelParser.IdContext ctx);
}