// Generated from G:/blah/src\grammars.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, INTEGER_LITERAL=47, FLOAT_LITERAL=48, STRING_LITERAL=49, BOOL_LITERAL=50, 
		ID=51, EOL=52, LINE_COMMENT=53, MULTI_LINE_COMMENT=54, WS=55;
	public static final int
		RULE_prog = 0, RULE_get = 1, RULE_function = 2, RULE_paramList = 3, RULE_param = 4, 
		RULE_dtype = 5, RULE_funcOut = 6, RULE_funcOutDtype = 7, RULE_block = 8, 
		RULE_stat = 9, RULE_display = 10, RULE_varDecl = 11, RULE_constDecl = 12, 
		RULE_expr = 13, RULE_exprList = 14, RULE_literal = 15, RULE_ifStmt = 16, 
		RULE_elif = 17, RULE_whileStmt = 18, RULE_forStmt = 19, RULE_forControl = 20, 
		RULE_returnStmt = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "get", "function", "paramList", "param", "dtype", "funcOut", 
			"funcOutDtype", "block", "stat", "display", "varDecl", "constDecl", "expr", 
			"exprList", "literal", "ifStmt", "elif", "whileStmt", "forStmt", "forControl", 
			"returnStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'get'", "'function'", "'('", "'inputs'", "':'", "')'", "','", 
			"'int'", "'float'", "'string'", "'bool'", "'output'", "'nothing'", "'{'", 
			"'}'", "'='", "'display'", "'const'", "'++'", "'--'", "'.'", "'!'", "'**'", 
			"'%'", "'*'", "'/'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", 
			"'!='", "'not'", "'and'", "'or'", "'check'", "'then'", "'else'", "'else-check'", 
			"'repeat'", "'range'", "'to'", "'change'", "'return'", null, null, null, 
			null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "INTEGER_LITERAL", 
			"FLOAT_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", "ID", "EOL", "LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "grammars.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<GetContext> get() {
			return getRuleContexts(GetContext.class);
		}
		public GetContext get(int i) {
			return getRuleContext(GetContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(44);
					get();
					}
					break;
				case T__1:
					{
					setState(45);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
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

	public static class GetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public TerminalNode EOL() { return getToken(grammarsParser.EOL, 0); }
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(ID);
			setState(53);
			match(EOL);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FuncOutContext funcOut() {
			return getRuleContext(FuncOutContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__1);
			setState(56);
			match(ID);
			setState(57);
			match(T__2);
			setState(58);
			match(T__3);
			setState(59);
			match(T__4);
			setState(60);
			paramList();
			setState(61);
			match(T__5);
			setState(62);
			match(T__4);
			setState(63);
			funcOut();
			setState(64);
			block();
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(66);
				param();
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(69);
				match(T__6);
				setState(70);
				param();
				}
				}
				setState(75);
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

	public static class ParamContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			dtype();
			setState(77);
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

	public static class DtypeContext extends ParserRuleContext {
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FuncOutContext extends ParserRuleContext {
		public FuncOutDtypeContext funcOutDtype() {
			return getRuleContext(FuncOutDtypeContext.class,0);
		}
		public FuncOutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcOut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterFuncOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitFuncOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitFuncOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncOutContext funcOut() throws RecognitionException {
		FuncOutContext _localctx = new FuncOutContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcOut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__11);
			setState(82);
			funcOutDtype();
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

	public static class FuncOutDtypeContext extends ParserRuleContext {
		public FuncOutDtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcOutDtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterFuncOutDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitFuncOutDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitFuncOutDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncOutDtypeContext funcOutDtype() throws RecognitionException {
		FuncOutDtypeContext _localctx = new FuncOutDtypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcOutDtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__13);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__37) | (1L << T__41) | (1L << T__45) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(87);
				stat();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__14);
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

	public static class StatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EOL() { return getToken(grammarsParser.EOL, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				display();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				varDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				constDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				ifStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				whileStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				forStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				returnStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				expr(0);
				setState(104);
				match(T__15);
				setState(105);
				expr(0);
				setState(106);
				match(EOL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				expr(0);
				setState(109);
				match(EOL);
				}
				break;
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

	public static class DisplayContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarsParser.EOL, 0); }
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitDisplay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__16);
			setState(114);
			match(T__2);
			setState(115);
			expr(0);
			setState(116);
			match(T__5);
			setState(117);
			match(EOL);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public TerminalNode EOL() { return getToken(grammarsParser.EOL, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(119);
				dtype();
				}
			}

			setState(122);
			match(ID);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(123);
				match(T__15);
				setState(124);
				expr(0);
				}
			}

			setState(127);
			match(EOL);
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

	public static class ConstDeclContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarsParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarsParser.EOL, 0); }
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__17);
			setState(130);
			dtype();
			setState(131);
			match(ID);
			setState(132);
			match(T__15);
			setState(133);
			expr(0);
			setState(134);
			match(EOL);
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(grammarsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(grammarsParser.ID, i);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(137);
				match(T__2);
				setState(138);
				expr(0);
				setState(139);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(141);
				match(ID);
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(143);
				match(ID);
				setState(144);
				match(T__20);
				setState(145);
				match(ID);
				setState(146);
				match(T__2);
				setState(147);
				exprList();
				setState(148);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				match(ID);
				}
				break;
			case 5:
				{
				setState(152);
				match(T__21);
				setState(153);
				expr(18);
				}
				break;
			case 6:
				{
				setState(154);
				match(ID);
				}
				break;
			case 7:
				{
				setState(155);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(159);
						match(T__22);
						setState(160);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(162);
						match(T__23);
						setState(163);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(165);
						match(T__24);
						setState(166);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(168);
						match(T__25);
						setState(169);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(171);
						match(T__26);
						setState(172);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(174);
						match(T__27);
						setState(175);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(177);
						match(T__28);
						setState(178);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(180);
						match(T__29);
						setState(181);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(183);
						match(T__30);
						setState(184);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(186);
						match(T__31);
						setState(187);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(189);
						match(T__32);
						setState(190);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(192);
						match(T__33);
						setState(193);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(195);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						expr(6);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(198);
						match(T__35);
						setState(199);
						expr(5);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(201);
						match(T__36);
						setState(202);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(208);
				expr(0);
				}
			}

			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(211);
				match(T__6);
				setState(212);
				expr(0);
				}
				}
				setState(217);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(grammarsParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(grammarsParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(grammarsParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(grammarsParser.BOOL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ElifContext> elif() {
			return getRuleContexts(ElifContext.class);
		}
		public ElifContext elif(int i) {
			return getRuleContext(ElifContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__37);
			setState(221);
			match(T__2);
			setState(222);
			expr(0);
			setState(223);
			match(T__5);
			setState(224);
			match(T__38);
			setState(225);
			block();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(226);
				elif();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(232);
				match(T__39);
				setState(233);
				block();
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

	public static class ElifContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__40);
			setState(237);
			match(T__2);
			setState(238);
			expr(0);
			setState(239);
			match(T__5);
			setState(240);
			match(T__38);
			setState(241);
			block();
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

	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__41);
			setState(244);
			match(T__2);
			setState(245);
			expr(0);
			setState(246);
			match(T__5);
			setState(247);
			block();
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

	public static class ForStmtContext extends ParserRuleContext {
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__41);
			setState(250);
			match(T__2);
			setState(251);
			forControl();
			setState(252);
			match(T__5);
			setState(253);
			block();
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

	public static class ForControlContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(grammarsParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(grammarsParser.INTEGER_LITERAL, i);
		}
		public TerminalNode EOL() { return getToken(grammarsParser.EOL, 0); }
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			varDecl();
			setState(256);
			match(T__42);
			setState(257);
			match(T__4);
			setState(258);
			match(INTEGER_LITERAL);
			setState(259);
			match(T__43);
			setState(260);
			match(INTEGER_LITERAL);
			setState(261);
			match(EOL);
			setState(262);
			match(T__44);
			setState(263);
			match(T__4);
			setState(264);
			match(INTEGER_LITERAL);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarsParser.EOL, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarsListener ) ((grammarsListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarsVisitor ) return ((grammarsVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__45);
			setState(267);
			expr(0);
			setState(268);
			match(EOL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\5\5F\n\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\7\n[\n\n\f\n\16\n^\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13r\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\5\r{\n\r\3\r\3\r\3\r\5\r"+
		"\u0080\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u009f\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ce\n\17\f\17\16"+
		"\17\u00d1\13\17\3\20\5\20\u00d4\n\20\3\20\3\20\7\20\u00d8\n\20\f\20\16"+
		"\20\u00db\13\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e6"+
		"\n\22\f\22\16\22\u00e9\13\22\3\22\3\22\5\22\u00ed\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\2\3\34\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,\2\7\3\2\n\r\4\2\n\r\17\17\3\2\25\26\4\2\30\30%%\3\2\61\64\2\u0123"+
		"\2\62\3\2\2\2\4\65\3\2\2\2\69\3\2\2\2\bE\3\2\2\2\nN\3\2\2\2\fQ\3\2\2\2"+
		"\16S\3\2\2\2\20V\3\2\2\2\22X\3\2\2\2\24q\3\2\2\2\26s\3\2\2\2\30z\3\2\2"+
		"\2\32\u0083\3\2\2\2\34\u009e\3\2\2\2\36\u00d3\3\2\2\2 \u00dc\3\2\2\2\""+
		"\u00de\3\2\2\2$\u00ee\3\2\2\2&\u00f5\3\2\2\2(\u00fb\3\2\2\2*\u0101\3\2"+
		"\2\2,\u010c\3\2\2\2.\61\5\4\3\2/\61\5\6\4\2\60.\3\2\2\2\60/\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\62\3\2\2\2\65"+
		"\66\7\3\2\2\66\67\7\65\2\2\678\7\66\2\28\5\3\2\2\29:\7\4\2\2:;\7\65\2"+
		"\2;<\7\5\2\2<=\7\6\2\2=>\7\7\2\2>?\5\b\5\2?@\7\b\2\2@A\7\7\2\2AB\5\16"+
		"\b\2BC\5\22\n\2C\7\3\2\2\2DF\5\n\6\2ED\3\2\2\2EF\3\2\2\2FK\3\2\2\2GH\7"+
		"\t\2\2HJ\5\n\6\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2\2MK"+
		"\3\2\2\2NO\5\f\7\2OP\7\65\2\2P\13\3\2\2\2QR\t\2\2\2R\r\3\2\2\2ST\7\16"+
		"\2\2TU\5\20\t\2U\17\3\2\2\2VW\t\3\2\2W\21\3\2\2\2X\\\7\20\2\2Y[\5\24\13"+
		"\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7"+
		"\21\2\2`\23\3\2\2\2ar\5\22\n\2br\5\26\f\2cr\5\30\r\2dr\5\32\16\2er\5\""+
		"\22\2fr\5&\24\2gr\5(\25\2hr\5,\27\2ij\5\34\17\2jk\7\22\2\2kl\5\34\17\2"+
		"lm\7\66\2\2mr\3\2\2\2no\5\34\17\2op\7\66\2\2pr\3\2\2\2qa\3\2\2\2qb\3\2"+
		"\2\2qc\3\2\2\2qd\3\2\2\2qe\3\2\2\2qf\3\2\2\2qg\3\2\2\2qh\3\2\2\2qi\3\2"+
		"\2\2qn\3\2\2\2r\25\3\2\2\2st\7\23\2\2tu\7\5\2\2uv\5\34\17\2vw\7\b\2\2"+
		"wx\7\66\2\2x\27\3\2\2\2y{\5\f\7\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|\177\7"+
		"\65\2\2}~\7\22\2\2~\u0080\5\34\17\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\7\66\2\2\u0082\31\3\2\2\2\u0083\u0084\7\24"+
		"\2\2\u0084\u0085\5\f\7\2\u0085\u0086\7\65\2\2\u0086\u0087\7\22\2\2\u0087"+
		"\u0088\5\34\17\2\u0088\u0089\7\66\2\2\u0089\33\3\2\2\2\u008a\u008b\b\17"+
		"\1\2\u008b\u008c\7\5\2\2\u008c\u008d\5\34\17\2\u008d\u008e\7\b\2\2\u008e"+
		"\u009f\3\2\2\2\u008f\u0090\7\65\2\2\u0090\u009f\t\4\2\2\u0091\u0092\7"+
		"\65\2\2\u0092\u0093\7\27\2\2\u0093\u0094\7\65\2\2\u0094\u0095\7\5\2\2"+
		"\u0095\u0096\5\36\20\2\u0096\u0097\7\b\2\2\u0097\u009f\3\2\2\2\u0098\u0099"+
		"\t\4\2\2\u0099\u009f\7\65\2\2\u009a\u009b\7\30\2\2\u009b\u009f\5\34\17"+
		"\24\u009c\u009f\7\65\2\2\u009d\u009f\5 \21\2\u009e\u008a\3\2\2\2\u009e"+
		"\u008f\3\2\2\2\u009e\u0091\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009a\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00cf\3\2\2\2\u00a0"+
		"\u00a1\f\23\2\2\u00a1\u00a2\7\31\2\2\u00a2\u00ce\5\34\17\24\u00a3\u00a4"+
		"\f\22\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00ce\5\34\17\23\u00a6\u00a7\f\21"+
		"\2\2\u00a7\u00a8\7\33\2\2\u00a8\u00ce\5\34\17\22\u00a9\u00aa\f\20\2\2"+
		"\u00aa\u00ab\7\34\2\2\u00ab\u00ce\5\34\17\21\u00ac\u00ad\f\17\2\2\u00ad"+
		"\u00ae\7\35\2\2\u00ae\u00ce\5\34\17\20\u00af\u00b0\f\16\2\2\u00b0\u00b1"+
		"\7\36\2\2\u00b1\u00ce\5\34\17\17\u00b2\u00b3\f\r\2\2\u00b3\u00b4\7\37"+
		"\2\2\u00b4\u00ce\5\34\17\16\u00b5\u00b6\f\f\2\2\u00b6\u00b7\7 \2\2\u00b7"+
		"\u00ce\5\34\17\r\u00b8\u00b9\f\13\2\2\u00b9\u00ba\7!\2\2\u00ba\u00ce\5"+
		"\34\17\f\u00bb\u00bc\f\n\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00ce\5\34\17\13"+
		"\u00be\u00bf\f\t\2\2\u00bf\u00c0\7#\2\2\u00c0\u00ce\5\34\17\n\u00c1\u00c2"+
		"\f\b\2\2\u00c2\u00c3\7$\2\2\u00c3\u00ce\5\34\17\t\u00c4\u00c5\f\7\2\2"+
		"\u00c5\u00c6\t\5\2\2\u00c6\u00ce\5\34\17\b\u00c7\u00c8\f\6\2\2\u00c8\u00c9"+
		"\7&\2\2\u00c9\u00ce\5\34\17\7\u00ca\u00cb\f\5\2\2\u00cb\u00cc\7\'\2\2"+
		"\u00cc\u00ce\5\34\17\6\u00cd\u00a0\3\2\2\2\u00cd\u00a3\3\2\2\2\u00cd\u00a6"+
		"\3\2\2\2\u00cd\u00a9\3\2\2\2\u00cd\u00ac\3\2\2\2\u00cd\u00af\3\2\2\2\u00cd"+
		"\u00b2\3\2\2\2\u00cd\u00b5\3\2\2\2\u00cd\u00b8\3\2\2\2\u00cd\u00bb\3\2"+
		"\2\2\u00cd\u00be\3\2\2\2\u00cd\u00c1\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd"+
		"\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\35\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4"+
		"\5\34\17\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d9\3\2\2\2"+
		"\u00d5\u00d6\7\t\2\2\u00d6\u00d8\5\34\17\2\u00d7\u00d5\3\2\2\2\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\37\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00dd\t\6\2\2\u00dd!\3\2\2\2\u00de\u00df\7(\2\2\u00df"+
		"\u00e0\7\5\2\2\u00e0\u00e1\5\34\17\2\u00e1\u00e2\7\b\2\2\u00e2\u00e3\7"+
		")\2\2\u00e3\u00e7\5\22\n\2\u00e4\u00e6\5$\23\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb\u00ed\5\22\n\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed#\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef"+
		"\u00f0\7\5\2\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\7\b\2\2\u00f2\u00f3\7"+
		")\2\2\u00f3\u00f4\5\22\n\2\u00f4%\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7"+
		"\7\5\2\2\u00f7\u00f8\5\34\17\2\u00f8\u00f9\7\b\2\2\u00f9\u00fa\5\22\n"+
		"\2\u00fa\'\3\2\2\2\u00fb\u00fc\7,\2\2\u00fc\u00fd\7\5\2\2\u00fd\u00fe"+
		"\5*\26\2\u00fe\u00ff\7\b\2\2\u00ff\u0100\5\22\n\2\u0100)\3\2\2\2\u0101"+
		"\u0102\5\30\r\2\u0102\u0103\7-\2\2\u0103\u0104\7\7\2\2\u0104\u0105\7\61"+
		"\2\2\u0105\u0106\7.\2\2\u0106\u0107\7\61\2\2\u0107\u0108\7\66\2\2\u0108"+
		"\u0109\7/\2\2\u0109\u010a\7\7\2\2\u010a\u010b\7\61\2\2\u010b+\3\2\2\2"+
		"\u010c\u010d\7\60\2\2\u010d\u010e\5\34\17\2\u010e\u010f\7\66\2\2\u010f"+
		"-\3\2\2\2\21\60\62EK\\qz\177\u009e\u00cd\u00cf\u00d3\u00d9\u00e7\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}