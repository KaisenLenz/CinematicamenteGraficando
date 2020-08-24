// Generated from C:\Users\Kaisen\Documents\NetBeansProjects\proyectotalf\src\proyectotalf\simple.g4 by ANTLR 4.8

    package proyectotalf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MRU=2, MRUA=3, CAIDA=4, LVA=5, LVAb=6, OPEN_B=7, CLOSE_B=8, ASK=9, 
		ACELERACION=10, TIEMPO=11, DISTANCIA=12, POS_INIC=13, POS_FINAL=14, VELOCIDAD=15, 
		VELOCIDAD_INICIAL=16, VELOCIDAD_FINAL=17, DOUBLE=18, PUNTO=19, NUMBER=20, 
		ID=21, WS=22;
	public static final int
		RULE_start = 0, RULE_consultas = 1, RULE_mru_cuerpo = 2, RULE_mrua_cuerpo = 3, 
		RULE_caida_cuerpo = 4, RULE_lva_cuerpo = 5, RULE_lvab_cuerpo = 6, RULE_assign = 7, 
		RULE_variable = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "consultas", "mru_cuerpo", "mrua_cuerpo", "caida_cuerpo", "lva_cuerpo", 
			"lvab_cuerpo", "assign", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'MRU'", "'MRUA'", "'CLibre'", "'LVArriba'", "'LVAbajo'", 
			"'{'", "'}'", "'?'", "'ACELERACION'", "'TIEMPO'", "'DISTANCIA'", "'POSICION_INICIAL'", 
			"'POSICION_FINAL'", "'VELOCIDAD'", "'VELOCIDAD_INICIAL'", "'VELOCIDAD_FINAL'", 
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MRU", "MRUA", "CAIDA", "LVA", "LVAb", "OPEN_B", "CLOSE_B", 
			"ASK", "ACELERACION", "TIEMPO", "DISTANCIA", "POS_INIC", "POS_FINAL", 
			"VELOCIDAD", "VELOCIDAD_INICIAL", "VELOCIDAD_FINAL", "DOUBLE", "PUNTO", 
			"NUMBER", "ID", "WS"
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
	public String getGrammarFileName() { return "simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<ConsultasContext> consultas() {
			return getRuleContexts(ConsultasContext.class);
		}
		public ConsultasContext consultas(int i) {
			return getRuleContext(ConsultasContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				consultas();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MRU) | (1L << MRUA) | (1L << CAIDA) | (1L << LVA) | (1L << LVAb))) != 0) );
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

	public static class ConsultasContext extends ParserRuleContext {
		public Mru_cuerpoContext mru_cuerpo() {
			return getRuleContext(Mru_cuerpoContext.class,0);
		}
		public Mrua_cuerpoContext mrua_cuerpo() {
			return getRuleContext(Mrua_cuerpoContext.class,0);
		}
		public Caida_cuerpoContext caida_cuerpo() {
			return getRuleContext(Caida_cuerpoContext.class,0);
		}
		public Lva_cuerpoContext lva_cuerpo() {
			return getRuleContext(Lva_cuerpoContext.class,0);
		}
		public Lvab_cuerpoContext lvab_cuerpo() {
			return getRuleContext(Lvab_cuerpoContext.class,0);
		}
		public ConsultasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consultas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterConsultas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitConsultas(this);
		}
	}

	public final ConsultasContext consultas() throws RecognitionException {
		ConsultasContext _localctx = new ConsultasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_consultas);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MRU:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				mru_cuerpo();
				}
				break;
			case MRUA:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				mrua_cuerpo();
				}
				break;
			case CAIDA:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				caida_cuerpo();
				}
				break;
			case LVA:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				lva_cuerpo();
				}
				break;
			case LVAb:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				lvab_cuerpo();
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

	public static class Mru_cuerpoContext extends ParserRuleContext {
		public TerminalNode MRU() { return getToken(simpleParser.MRU, 0); }
		public TerminalNode OPEN_B() { return getToken(simpleParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(simpleParser.CLOSE_B, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public Mru_cuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mru_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterMru_cuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitMru_cuerpo(this);
		}
	}

	public final Mru_cuerpoContext mru_cuerpo() throws RecognitionException {
		Mru_cuerpoContext _localctx = new Mru_cuerpoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mru_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(MRU);
			setState(31);
			match(OPEN_B);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				assign();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACELERACION) | (1L << TIEMPO) | (1L << DISTANCIA) | (1L << POS_INIC) | (1L << POS_FINAL) | (1L << VELOCIDAD) | (1L << VELOCIDAD_INICIAL) | (1L << VELOCIDAD_FINAL))) != 0) );
			setState(37);
			match(CLOSE_B);
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

	public static class Mrua_cuerpoContext extends ParserRuleContext {
		public TerminalNode MRUA() { return getToken(simpleParser.MRUA, 0); }
		public TerminalNode OPEN_B() { return getToken(simpleParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(simpleParser.CLOSE_B, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public Mrua_cuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mrua_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterMrua_cuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitMrua_cuerpo(this);
		}
	}

	public final Mrua_cuerpoContext mrua_cuerpo() throws RecognitionException {
		Mrua_cuerpoContext _localctx = new Mrua_cuerpoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mrua_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(MRUA);
			setState(40);
			match(OPEN_B);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				assign();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACELERACION) | (1L << TIEMPO) | (1L << DISTANCIA) | (1L << POS_INIC) | (1L << POS_FINAL) | (1L << VELOCIDAD) | (1L << VELOCIDAD_INICIAL) | (1L << VELOCIDAD_FINAL))) != 0) );
			setState(46);
			match(CLOSE_B);
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

	public static class Caida_cuerpoContext extends ParserRuleContext {
		public TerminalNode CAIDA() { return getToken(simpleParser.CAIDA, 0); }
		public TerminalNode OPEN_B() { return getToken(simpleParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(simpleParser.CLOSE_B, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public Caida_cuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caida_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterCaida_cuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitCaida_cuerpo(this);
		}
	}

	public final Caida_cuerpoContext caida_cuerpo() throws RecognitionException {
		Caida_cuerpoContext _localctx = new Caida_cuerpoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_caida_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(CAIDA);
			setState(49);
			match(OPEN_B);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				assign();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACELERACION) | (1L << TIEMPO) | (1L << DISTANCIA) | (1L << POS_INIC) | (1L << POS_FINAL) | (1L << VELOCIDAD) | (1L << VELOCIDAD_INICIAL) | (1L << VELOCIDAD_FINAL))) != 0) );
			setState(55);
			match(CLOSE_B);
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

	public static class Lva_cuerpoContext extends ParserRuleContext {
		public TerminalNode LVA() { return getToken(simpleParser.LVA, 0); }
		public TerminalNode OPEN_B() { return getToken(simpleParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(simpleParser.CLOSE_B, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public Lva_cuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lva_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterLva_cuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitLva_cuerpo(this);
		}
	}

	public final Lva_cuerpoContext lva_cuerpo() throws RecognitionException {
		Lva_cuerpoContext _localctx = new Lva_cuerpoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lva_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LVA);
			setState(58);
			match(OPEN_B);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				assign();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACELERACION) | (1L << TIEMPO) | (1L << DISTANCIA) | (1L << POS_INIC) | (1L << POS_FINAL) | (1L << VELOCIDAD) | (1L << VELOCIDAD_INICIAL) | (1L << VELOCIDAD_FINAL))) != 0) );
			setState(64);
			match(CLOSE_B);
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

	public static class Lvab_cuerpoContext extends ParserRuleContext {
		public TerminalNode LVAb() { return getToken(simpleParser.LVAb, 0); }
		public TerminalNode OPEN_B() { return getToken(simpleParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(simpleParser.CLOSE_B, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public Lvab_cuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvab_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterLvab_cuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitLvab_cuerpo(this);
		}
	}

	public final Lvab_cuerpoContext lvab_cuerpo() throws RecognitionException {
		Lvab_cuerpoContext _localctx = new Lvab_cuerpoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lvab_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(LVAb);
			setState(67);
			match(OPEN_B);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				assign();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACELERACION) | (1L << TIEMPO) | (1L << DISTANCIA) | (1L << POS_INIC) | (1L << POS_FINAL) | (1L << VELOCIDAD) | (1L << VELOCIDAD_INICIAL) | (1L << VELOCIDAD_FINAL))) != 0) );
			setState(73);
			match(CLOSE_B);
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

	public static class AssignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(simpleParser.DOUBLE, 0); }
		public TerminalNode ASK() { return getToken(simpleParser.ASK, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			variable();
			setState(76);
			match(T__0);
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==ASK || _la==DOUBLE) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ACELERACION() { return getToken(simpleParser.ACELERACION, 0); }
		public TerminalNode TIEMPO() { return getToken(simpleParser.TIEMPO, 0); }
		public TerminalNode DISTANCIA() { return getToken(simpleParser.DISTANCIA, 0); }
		public TerminalNode POS_INIC() { return getToken(simpleParser.POS_INIC, 0); }
		public TerminalNode POS_FINAL() { return getToken(simpleParser.POS_FINAL, 0); }
		public TerminalNode VELOCIDAD() { return getToken(simpleParser.VELOCIDAD, 0); }
		public TerminalNode VELOCIDAD_INICIAL() { return getToken(simpleParser.VELOCIDAD_INICIAL, 0); }
		public TerminalNode VELOCIDAD_FINAL() { return getToken(simpleParser.VELOCIDAD_FINAL, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACELERACION) | (1L << TIEMPO) | (1L << DISTANCIA) | (1L << POS_INIC) | (1L << POS_FINAL) | (1L << VELOCIDAD) | (1L << VELOCIDAD_INICIAL) | (1L << VELOCIDAD_FINAL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\6\4$\n\4\r"+
		"\4\16\4%\3\4\3\4\3\5\3\5\3\5\6\5-\n\5\r\5\16\5.\3\5\3\5\3\6\3\6\3\6\6"+
		"\6\66\n\6\r\6\16\6\67\3\6\3\6\3\7\3\7\3\7\6\7?\n\7\r\7\16\7@\3\7\3\7\3"+
		"\b\3\b\3\b\6\bH\n\b\r\b\16\bI\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\2\2"+
		"\13\2\4\6\b\n\f\16\20\22\2\4\4\2\13\13\24\24\3\2\f\23\2T\2\25\3\2\2\2"+
		"\4\36\3\2\2\2\6 \3\2\2\2\b)\3\2\2\2\n\62\3\2\2\2\f;\3\2\2\2\16D\3\2\2"+
		"\2\20M\3\2\2\2\22Q\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\37\5\6\4\2\32\37\5\b\5\2\33"+
		"\37\5\n\6\2\34\37\5\f\7\2\35\37\5\16\b\2\36\31\3\2\2\2\36\32\3\2\2\2\36"+
		"\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7\4\2\2!#\7\t\2"+
		"\2\"$\5\20\t\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'("+
		"\7\n\2\2(\7\3\2\2\2)*\7\5\2\2*,\7\t\2\2+-\5\20\t\2,+\3\2\2\2-.\3\2\2\2"+
		".,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\n\2\2\61\t\3\2\2\2\62\63\7\6"+
		"\2\2\63\65\7\t\2\2\64\66\5\20\t\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\289\3\2\2\29:\7\n\2\2:\13\3\2\2\2;<\7\7\2\2<>\7\t\2\2"+
		"=?\5\20\t\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\n\2"+
		"\2C\r\3\2\2\2DE\7\b\2\2EG\7\t\2\2FH\5\20\t\2GF\3\2\2\2HI\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\n\2\2L\17\3\2\2\2MN\5\22\n\2NO\7\3\2\2OP"+
		"\t\2\2\2P\21\3\2\2\2QR\t\3\2\2R\23\3\2\2\2\t\27\36%.\67@I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}