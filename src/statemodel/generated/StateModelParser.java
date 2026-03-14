// Generated from C:/repos/homework1_antlr/src/statemodel/StateModel.g4 by ANTLR 4.13.2
package statemodel.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StateModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCURLY=1, RCURLY=2, DDOT=3, COMMA=4, TRANSITION=5, STATES=6, INITIAL=7, 
		NORMAL=8, ERROR=9, TRANSITIONS=10, TRANS=11, STATE_NAME=12, ID=13, WS=14, 
		COMMENT=15, LINE_COMMENT=16;
	public static final int
		RULE_model = 0, RULE_statesBlock = 1, RULE_stateDef = 2, RULE_stateLabels = 3, 
		RULE_transitionsBlock = 4, RULE_transitionElement = 5, RULE_schemaDef = 6, 
		RULE_transitionDef = 7, RULE_isInitial = 8, RULE_stateName = 9, RULE_isError = 10, 
		RULE_id = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "statesBlock", "stateDef", "stateLabels", "transitionsBlock", 
			"transitionElement", "schemaDef", "transitionDef", "isInitial", "stateName", 
			"isError", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "','", "'->'", "'states'", "'initial'", "'normal'", 
			"'error'", "'transitions'", "'trans'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LCURLY", "RCURLY", "DDOT", "COMMA", "TRANSITION", "STATES", "INITIAL", 
			"NORMAL", "ERROR", "TRANSITIONS", "TRANS", "STATE_NAME", "ID", "WS", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "StateModel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StateModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public StatesBlockContext statesBlock() {
			return getRuleContext(StatesBlockContext.class,0);
		}
		public TransitionsBlockContext transitionsBlock() {
			return getRuleContext(TransitionsBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(StateModelParser.EOF, 0); }
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			statesBlock();
			setState(25);
			transitionsBlock();
			setState(26);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatesBlockContext extends ParserRuleContext {
		public TerminalNode STATES() { return getToken(StateModelParser.STATES, 0); }
		public TerminalNode LCURLY() { return getToken(StateModelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(StateModelParser.RCURLY, 0); }
		public List<StateDefContext> stateDef() {
			return getRuleContexts(StateDefContext.class);
		}
		public StateDefContext stateDef(int i) {
			return getRuleContext(StateDefContext.class,i);
		}
		public StatesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStatesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStatesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStatesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatesBlockContext statesBlock() throws RecognitionException {
		StatesBlockContext _localctx = new StatesBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(STATES);
			setState(29);
			match(LCURLY);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				stateDef();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INITIAL || _la==STATE_NAME );
			setState(35);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateDefContext extends ParserRuleContext {
		public StateNameContext stateName() {
			return getRuleContext(StateNameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(StateModelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(StateModelParser.RCURLY, 0); }
		public IsInitialContext isInitial() {
			return getRuleContext(IsInitialContext.class,0);
		}
		public StateLabelsContext stateLabels() {
			return getRuleContext(StateLabelsContext.class,0);
		}
		public IsErrorContext isError() {
			return getRuleContext(IsErrorContext.class,0);
		}
		public StateDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStateDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStateDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStateDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDefContext stateDef() throws RecognitionException {
		StateDefContext _localctx = new StateDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stateDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(37);
				isInitial();
				}
			}

			setState(40);
			stateName();
			setState(41);
			match(LCURLY);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(42);
				stateLabels();
				}
			}

			setState(45);
			match(RCURLY);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ERROR) {
				{
				setState(46);
				isError();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateLabelsContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StateModelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StateModelParser.COMMA, i);
		}
		public StateLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStateLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStateLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStateLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateLabelsContext stateLabels() throws RecognitionException {
		StateLabelsContext _localctx = new StateLabelsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stateLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			id();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50);
				match(COMMA);
				setState(51);
				id();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionsBlockContext extends ParserRuleContext {
		public TerminalNode TRANSITIONS() { return getToken(StateModelParser.TRANSITIONS, 0); }
		public TerminalNode LCURLY() { return getToken(StateModelParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(StateModelParser.RCURLY, 0); }
		public List<TransitionElementContext> transitionElement() {
			return getRuleContexts(TransitionElementContext.class);
		}
		public TransitionElementContext transitionElement(int i) {
			return getRuleContext(TransitionElementContext.class,i);
		}
		public TransitionsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionsBlockContext transitionsBlock() throws RecognitionException {
		TransitionsBlockContext _localctx = new TransitionsBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transitionsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(TRANSITIONS);
			setState(58);
			match(LCURLY);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				transitionElement();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TRANS || _la==ID );
			setState(64);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionElementContext extends ParserRuleContext {
		public SchemaDefContext schemaDef() {
			return getRuleContext(SchemaDefContext.class,0);
		}
		public TransitionDefContext transitionDef() {
			return getRuleContext(TransitionDefContext.class,0);
		}
		public TransitionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionElementContext transitionElement() throws RecognitionException {
		TransitionElementContext _localctx = new TransitionElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transitionElement);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRANS:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				schemaDef();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				transitionDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaDefContext extends ParserRuleContext {
		public TerminalNode TRANS() { return getToken(StateModelParser.TRANS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode NORMAL() { return getToken(StateModelParser.NORMAL, 0); }
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public SchemaDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterSchemaDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitSchemaDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitSchemaDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaDefContext schemaDef() throws RecognitionException {
		SchemaDefContext _localctx = new SchemaDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_schemaDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(TRANS);
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==NORMAL || _la==ERROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionDefContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DDOT() { return getToken(StateModelParser.DDOT, 0); }
		public List<StateNameContext> stateName() {
			return getRuleContexts(StateNameContext.class);
		}
		public StateNameContext stateName(int i) {
			return getRuleContext(StateNameContext.class,i);
		}
		public TerminalNode TRANSITION() { return getToken(StateModelParser.TRANSITION, 0); }
		public TransitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterTransitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitTransitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitTransitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionDefContext transitionDef() throws RecognitionException {
		TransitionDefContext _localctx = new TransitionDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transitionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			id();
			setState(75);
			match(DDOT);
			setState(76);
			stateName();
			setState(77);
			match(TRANSITION);
			setState(78);
			stateName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsInitialContext extends ParserRuleContext {
		public TerminalNode INITIAL() { return getToken(StateModelParser.INITIAL, 0); }
		public IsInitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isInitial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterIsInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitIsInitial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitIsInitial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsInitialContext isInitial() throws RecognitionException {
		IsInitialContext _localctx = new IsInitialContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_isInitial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(INITIAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateNameContext extends ParserRuleContext {
		public TerminalNode STATE_NAME() { return getToken(StateModelParser.STATE_NAME, 0); }
		public StateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterStateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitStateName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitStateName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateNameContext stateName() throws RecognitionException {
		StateNameContext _localctx = new StateNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(STATE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsErrorContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(StateModelParser.ERROR, 0); }
		public IsErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterIsError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitIsError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitIsError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsErrorContext isError() throws RecognitionException {
		IsErrorContext _localctx = new IsErrorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_isError);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ERROR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StateModelParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateModelListener ) ((StateModelListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateModelVisitor ) return ((StateModelVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010Y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001 \b\u0001\u000b\u0001\f\u0001!\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u00035\b\u0003\n\u0003\f\u00038\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004=\b\u0004\u000b"+
		"\u0004\f\u0004>\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005E\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0001\u0001\u0000\b\tS\u0000\u0018\u0001\u0000\u0000\u0000"+
		"\u0002\u001c\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006"+
		"1\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000"+
		"\u0000\fF\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010"+
		"P\u0001\u0000\u0000\u0000\u0012R\u0001\u0000\u0000\u0000\u0014T\u0001"+
		"\u0000\u0000\u0000\u0016V\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002"+
		"\u0001\u0000\u0019\u001a\u0003\b\u0004\u0000\u001a\u001b\u0005\u0000\u0000"+
		"\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0006\u0000"+
		"\u0000\u001d\u001f\u0005\u0001\u0000\u0000\u001e \u0003\u0004\u0002\u0000"+
		"\u001f\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#$\u0005\u0002\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%\'\u0003"+
		"\u0010\b\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'"+
		"(\u0001\u0000\u0000\u0000()\u0003\u0012\t\u0000)+\u0005\u0001\u0000\u0000"+
		"*,\u0003\u0006\u0003\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-/\u0005\u0002\u0000\u0000.0\u0003\u0014"+
		"\n\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0005\u0001"+
		"\u0000\u0000\u000016\u0003\u0016\u000b\u000023\u0005\u0004\u0000\u0000"+
		"35\u0003\u0016\u000b\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0007\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\n\u0000\u0000:<\u0005"+
		"\u0001\u0000\u0000;=\u0003\n\u0005\u0000<;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@A\u0005\u0002\u0000\u0000A\t\u0001\u0000\u0000"+
		"\u0000BE\u0003\f\u0006\u0000CE\u0003\u000e\u0007\u0000DB\u0001\u0000\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000E\u000b\u0001\u0000\u0000\u0000FG\u0005"+
		"\u000b\u0000\u0000GH\u0007\u0000\u0000\u0000HI\u0003\u0016\u000b\u0000"+
		"I\r\u0001\u0000\u0000\u0000JK\u0003\u0016\u000b\u0000KL\u0005\u0003\u0000"+
		"\u0000LM\u0003\u0012\t\u0000MN\u0005\u0005\u0000\u0000NO\u0003\u0012\t"+
		"\u0000O\u000f\u0001\u0000\u0000\u0000PQ\u0005\u0007\u0000\u0000Q\u0011"+
		"\u0001\u0000\u0000\u0000RS\u0005\f\u0000\u0000S\u0013\u0001\u0000\u0000"+
		"\u0000TU\u0005\t\u0000\u0000U\u0015\u0001\u0000\u0000\u0000VW\u0005\r"+
		"\u0000\u0000W\u0017\u0001\u0000\u0000\u0000\u0007!&+/6>D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}