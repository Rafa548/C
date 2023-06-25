// Generated from /home/rafael/Documentos/Uni-Cadeiras/2-ano/2-semestre/C/c2023-adv-01/src/ADV.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ADVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, SINGLE=55, BLOCK=56, PROPERTY_NAME=57, AUTOMATON_TYPE=58, 
		TYPE=59, SYMBOL=60, BOOLEAN=61, DOUBLE=62, INT=63, ID=64, WS=65;
	public static final int
		RULE_program = 0, RULE_section = 1, RULE_alphabet = 2, RULE_automaton = 3, 
		RULE_state = 4, RULE_play = 5, RULE_state_def = 6, RULE_transition = 7, 
		RULE_transition_def = 8, RULE_view = 9, RULE_view_content = 10, RULE_grid = 11, 
		RULE_grid_opt = 12, RULE_place = 13, RULE_construct_line = 14, RULE_view_state = 15, 
		RULE_point = 16, RULE_declare_point = 17, RULE_initID = 18, RULE_expr = 19, 
		RULE_animation = 20, RULE_animation_content = 21, RULE_animation_def = 22, 
		RULE_action = 23, RULE_action_part = 24, RULE_align_type = 25, RULE_for_cycle = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "section", "alphabet", "automaton", "state", "play", "state_def", 
			"transition", "transition_def", "view", "view_content", "grid", "grid_opt", 
			"place", "construct_line", "view_state", "point", "declare_point", "initID", 
			"expr", "animation", "animation_content", "animation_def", "action", 
			"action_part", "align_type", "for_cycle"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'alphabet'", "'{'", "','", "'}'", "'<<<'", "';'", "'>>>'", "'state'", 
			"'play'", "'['", "'='", "']'", "'transition'", "'->'", "'view'", "'of'", 
			"'place'", "'grid'", "'('", "')'", "'step'", "'margin'", "'color'", "'line'", 
			"'<'", "'>'", "'#label'", "'align'", "'at'", "'as'", "'--'", "':'", "'point'", 
			"'/'", "'*'", "'+'", "'-'", "'animation'", "'viewport'", "'for'", "'++'", 
			"'on'", "'pause'", "'show'", "'below'", "'above'", "'left'", "'right'", 
			"'center'", "'top'", "'bottom'", "'in'", "'{{'", "'}}'", null, null, 
			null, "'complete'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "SINGLE", "BLOCK", "PROPERTY_NAME", 
			"AUTOMATON_TYPE", "TYPE", "SYMBOL", "BOOLEAN", "DOUBLE", "INT", "ID", 
			"WS"
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
	public String getGrammarFileName() { return "ADV.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ADVParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ADVParser.EOF, 0); }
		public AlphabetContext alphabet() {
			return getRuleContext(AlphabetContext.class,0);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54);
			alphabet();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__14) | (1L << T__37) | (1L << AUTOMATON_TYPE) | (1L << TYPE))) != 0)) {
				{
				{
				setState(55);
				section();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(61);
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

	public static class SectionContext extends ParserRuleContext {
		public AutomatonContext automaton() {
			return getRuleContext(AutomatonContext.class,0);
		}
		public ViewContext view() {
			return getRuleContext(ViewContext.class,0);
		}
		public AnimationContext animation() {
			return getRuleContext(AnimationContext.class,0);
		}
		public PlayContext play() {
			return getRuleContext(PlayContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTOMATON_TYPE:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				automaton();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				view();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				animation();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				play();
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

	public static class AlphabetContext extends ParserRuleContext {
		public List<TerminalNode> SYMBOL() { return getTokens(ADVParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(ADVParser.SYMBOL, i);
		}
		public AlphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabet; }
	}

	public final AlphabetContext alphabet() throws RecognitionException {
		AlphabetContext _localctx = new AlphabetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
			setState(70);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYMBOL) {
				{
				setState(71);
				match(SYMBOL);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(72);
					match(T__2);
					setState(73);
					match(SYMBOL);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81);
			match(T__3);
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

	public static class AutomatonContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ADVParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(ADVParser.ID, 0); }
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public TerminalNode AUTOMATON_TYPE() { return getToken(ADVParser.AUTOMATON_TYPE, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<For_cycleContext> for_cycle() {
			return getRuleContexts(For_cycleContext.class);
		}
		public For_cycleContext for_cycle(int i) {
			return getRuleContext(For_cycleContext.class,i);
		}
		public List<State_defContext> state_def() {
			return getRuleContexts(State_defContext.class);
		}
		public State_defContext state_def(int i) {
			return getRuleContext(State_defContext.class,i);
		}
		public AutomatonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automaton; }
	}

	public final AutomatonContext automaton() throws RecognitionException {
		AutomatonContext _localctx = new AutomatonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_automaton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTOMATON_TYPE) {
				{
				setState(83);
				match(AUTOMATON_TYPE);
				}
			}

			setState(86);
			match(TYPE);
			setState(87);
			match(ID);
			setState(88);
			match(T__4);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(89);
				state();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==ID) {
				{
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					{
					setState(95);
					state_def();
					setState(96);
					match(T__5);
					}
					}
					break;
				case T__39:
					{
					setState(98);
					for_cycle();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			transition();
			setState(105);
			match(T__6);
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

	public static class StateContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__7);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(108);
				match(ID);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(109);
					match(T__2);
					setState(110);
					match(ID);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(118);
			match(T__5);
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

	public static class PlayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ADVParser.ID, 0); }
		public PlayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play; }
	}

	public final PlayContext play() throws RecognitionException {
		PlayContext _localctx = new PlayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_play);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__8);
			setState(121);
			match(ID);
			setState(122);
			match(T__5);
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

	public static class State_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ADVParser.ID, 0); }
		public List<TerminalNode> PROPERTY_NAME() { return getTokens(ADVParser.PROPERTY_NAME); }
		public TerminalNode PROPERTY_NAME(int i) {
			return getToken(ADVParser.PROPERTY_NAME, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(ADVParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(ADVParser.BOOLEAN, i);
		}
		public State_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_def; }
	}

	public final State_defContext state_def() throws RecognitionException {
		State_defContext _localctx = new State_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_state_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			match(T__9);
			setState(126);
			match(PROPERTY_NAME);
			setState(127);
			match(T__10);
			setState(128);
			match(BOOLEAN);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(129);
				match(T__2);
				setState(130);
				match(PROPERTY_NAME);
				setState(131);
				match(T__10);
				setState(132);
				match(BOOLEAN);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__11);
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

	public static class TransitionContext extends ParserRuleContext {
		public List<Transition_defContext> transition_def() {
			return getRuleContexts(Transition_defContext.class);
		}
		public Transition_defContext transition_def(int i) {
			return getRuleContext(Transition_defContext.class,i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__12);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(141);
				transition_def();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(142);
					match(T__2);
					}
				}

				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__5);
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

	public static class Transition_defContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(ADVParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(ADVParser.SYMBOL, i);
		}
		public Transition_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition_def; }
	}

	public final Transition_defContext transition_def() throws RecognitionException {
		Transition_defContext _localctx = new Transition_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transition_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(T__13);
			setState(154);
			match(SYMBOL);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(155);
				match(T__2);
				setState(156);
				match(SYMBOL);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__13);
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(163);
				match(ID);
				}
				break;
			case T__1:
				{
				setState(164);
				match(T__1);
				setState(165);
				match(ID);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(166);
					match(T__2);
					setState(167);
					match(ID);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ViewContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public List<View_contentContext> view_content() {
			return getRuleContexts(View_contentContext.class);
		}
		public View_contentContext view_content(int i) {
			return getRuleContext(View_contentContext.class,i);
		}
		public ViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view; }
	}

	public final ViewContext view() throws RecognitionException {
		ViewContext _localctx = new ViewContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__14);
			setState(177);
			match(ID);
			setState(178);
			match(T__15);
			setState(179);
			match(ID);
			setState(180);
			match(T__4);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__16 - 6)) | (1L << (T__17 - 6)) | (1L << (T__24 - 6)) | (1L << (T__32 - 6)) | (1L << (ID - 6)))) != 0)) {
				{
				{
				setState(181);
				view_content();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(T__6);
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

	public static class View_contentContext extends ParserRuleContext {
		public List<View_stateContext> view_state() {
			return getRuleContexts(View_stateContext.class);
		}
		public View_stateContext view_state(int i) {
			return getRuleContext(View_stateContext.class,i);
		}
		public Declare_pointContext declare_point() {
			return getRuleContext(Declare_pointContext.class,0);
		}
		public List<Construct_lineContext> construct_line() {
			return getRuleContexts(Construct_lineContext.class);
		}
		public Construct_lineContext construct_line(int i) {
			return getRuleContext(Construct_lineContext.class,i);
		}
		public List<PlaceContext> place() {
			return getRuleContexts(PlaceContext.class);
		}
		public PlaceContext place(int i) {
			return getRuleContext(PlaceContext.class,i);
		}
		public List<GridContext> grid() {
			return getRuleContexts(GridContext.class);
		}
		public GridContext grid(int i) {
			return getRuleContext(GridContext.class,i);
		}
		public View_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_content; }
	}

	public final View_contentContext view_content() throws RecognitionException {
		View_contentContext _localctx = new View_contentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_view_content);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(189);
				match(T__16);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(190);
					view_state();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(196);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(197);
				declare_point();
				setState(198);
				match(T__5);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(200);
					construct_line();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16 || _la==T__24) {
					{
					{
					setState(207);
					place();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(214);
					grid();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(T__5);
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

	public static class GridContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(ADVParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(ADVParser.DOUBLE, i);
		}
		public List<Grid_optContext> grid_opt() {
			return getRuleContexts(Grid_optContext.class);
		}
		public Grid_optContext grid_opt(int i) {
			return getRuleContext(Grid_optContext.class,i);
		}
		public GridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grid; }
	}

	public final GridContext grid() throws RecognitionException {
		GridContext _localctx = new GridContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_grid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__17);
			setState(224);
			match(ID);
			setState(225);
			match(T__18);
			setState(226);
			match(DOUBLE);
			setState(227);
			match(T__2);
			setState(228);
			match(DOUBLE);
			setState(229);
			match(T__19);
			setState(230);
			match(T__9);
			setState(231);
			grid_opt();
			setState(232);
			match(T__10);
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(234);
				match(T__2);
				setState(235);
				grid_opt();
				setState(236);
				match(T__10);
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==DOUBLE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(T__11);
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

	public static class Grid_optContext extends ParserRuleContext {
		public Grid_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grid_opt; }
	}

	public final Grid_optContext grid_opt() throws RecognitionException {
		Grid_optContext _localctx = new Grid_optContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_grid_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class PlaceContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public List<Align_typeContext> align_type() {
			return getRuleContexts(Align_typeContext.class);
		}
		public Align_typeContext align_type(int i) {
			return getRuleContext(Align_typeContext.class,i);
		}
		public PlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place; }
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_place);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(248);
				match(T__16);
				}
			}

			setState(251);
			match(T__24);
			setState(252);
			match(ID);
			setState(253);
			match(T__2);
			setState(254);
			match(ID);
			setState(255);
			match(T__25);
			setState(256);
			match(T__26);
			setState(257);
			match(T__9);
			setState(258);
			match(T__27);
			setState(259);
			match(T__10);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) {
				{
				{
				setState(260);
				align_type();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(T__11);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(267);
				match(T__28);
				setState(268);
				match(ID);
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

	public static class Construct_lineContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public Construct_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construct_line; }
	}

	public final Construct_lineContext construct_line() throws RecognitionException {
		Construct_lineContext _localctx = new Construct_lineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_construct_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__24);
			setState(272);
			match(ID);
			setState(273);
			match(T__2);
			setState(274);
			match(ID);
			setState(275);
			match(T__25);
			setState(276);
			match(T__29);
			setState(277);
			match(ID);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(278);
				match(T__30);
				setState(279);
				match(ID);
				}
				}
				setState(284);
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

	public static class View_stateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ADVParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public View_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_state; }
	}

	public final View_stateContext view_state() throws RecognitionException {
		View_stateContext _localctx = new View_stateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_view_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ID);
			setState(286);
			match(T__28);
			setState(287);
			expr(0);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(288);
				match(T__2);
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

	public static class PointContext extends ParserRuleContext {
		public Token div;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__18);
			setState(292);
			expr(0);
			setState(293);
			((PointContext)_localctx).div = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__31) ) {
				((PointContext)_localctx).div = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(294);
			expr(0);
			setState(295);
			match(T__19);
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

	public static class Declare_pointContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public List<InitIDContext> initID() {
			return getRuleContexts(InitIDContext.class);
		}
		public InitIDContext initID(int i) {
			return getRuleContext(InitIDContext.class,i);
		}
		public Declare_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_point; }
	}

	public final Declare_pointContext declare_point() throws RecognitionException {
		Declare_pointContext _localctx = new Declare_pointContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declare_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(297);
				match(T__32);
				}
			}

			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				{
				setState(300);
				initID();
				}
				}
				break;
			case 2:
				{
				setState(301);
				match(ID);
				}
				break;
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					{
					setState(304);
					match(T__2);
					setState(305);
					match(ID);
					}
					}
					break;
				case 2:
					{
					setState(306);
					match(T__2);
					setState(307);
					initID();
					}
					break;
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InitIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ADVParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initID; }
	}

	public final InitIDContext initID() throws RecognitionException {
		InitIDContext _localctx = new InitIDContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ID);
			setState(314);
			match(T__10);
			setState(315);
			expr(0);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprDoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(ADVParser.DOUBLE, 0); }
		public ExprDoubleContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMulDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPointContext extends ExprContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExprPointContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprUnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(ADVParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(318);
				((ExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
					((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(319);
				expr(6);
				}
				break;
			case 2:
				{
				_localctx = new ExprPointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				point();
				}
				break;
			case 3:
				{
				_localctx = new ExprDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(DOUBLE);
				}
				break;
			case 4:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				match(T__18);
				setState(324);
				expr(0);
				setState(325);
				match(T__19);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(335);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(330);
						((ExprMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((ExprMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(333);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(334);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class AnimationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ADVParser.ID, 0); }
		public List<Animation_contentContext> animation_content() {
			return getRuleContexts(Animation_contentContext.class);
		}
		public Animation_contentContext animation_content(int i) {
			return getRuleContext(Animation_contentContext.class,i);
		}
		public List<Animation_defContext> animation_def() {
			return getRuleContexts(Animation_defContext.class);
		}
		public Animation_defContext animation_def(int i) {
			return getRuleContext(Animation_defContext.class,i);
		}
		public AnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation; }
	}

	public final AnimationContext animation() throws RecognitionException {
		AnimationContext _localctx = new AnimationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_animation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__37);
			setState(341);
			match(ID);
			setState(342);
			match(T__4);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(344); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(343);
						animation_content();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(346); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__41) {
					{
					{
					setState(348);
					animation_def();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(T__6);
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

	public static class Animation_contentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Animation_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation_content; }
	}

	public final Animation_contentContext animation_content() throws RecognitionException {
		Animation_contentContext _localctx = new Animation_contentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_animation_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__38);
			setState(362);
			match(ID);
			setState(363);
			match(T__39);
			setState(364);
			match(ID);
			setState(365);
			match(T__28);
			setState(366);
			expr(0);
			setState(367);
			match(T__30);
			setState(368);
			match(T__40);
			setState(369);
			expr(0);
			setState(370);
			match(T__5);
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

	public static class Animation_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ADVParser.ID, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<For_cycleContext> for_cycle() {
			return getRuleContexts(For_cycleContext.class);
		}
		public For_cycleContext for_cycle(int i) {
			return getRuleContext(For_cycleContext.class,i);
		}
		public Animation_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation_def; }
	}

	public final Animation_defContext animation_def() throws RecognitionException {
		Animation_defContext _localctx = new Animation_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_animation_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__41);
			setState(373);
			match(ID);
			setState(374);
			match(T__4);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39 || _la==T__43) {
				{
				setState(377);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__43:
					{
					setState(375);
					action();
					}
					break;
				case T__39:
					{
					setState(376);
					for_cycle();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(382);
				match(T__42);
				setState(383);
				match(T__5);
				}
			}

			setState(386);
			match(T__6);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(387);
				match(T__42);
				setState(388);
				match(T__5);
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

	public static class ActionContext extends ParserRuleContext {
		public List<Action_partContext> action_part() {
			return getRuleContexts(Action_partContext.class);
		}
		public Action_partContext action_part(int i) {
			return getRuleContext(Action_partContext.class,i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__43);
			{
			setState(392);
			action_part();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(393);
				match(T__2);
				setState(394);
				action_part();
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(T__5);
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(401);
				match(T__42);
				setState(402);
				match(T__5);
				}
				break;
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

	public static class Action_partContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public TerminalNode SYMBOL() { return getToken(ADVParser.SYMBOL, 0); }
		public State_defContext state_def() {
			return getRuleContext(State_defContext.class,0);
		}
		public Action_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_part; }
	}

	public final Action_partContext action_part() throws RecognitionException {
		Action_partContext _localctx = new Action_partContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_action_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(405);
				match(ID);
				}
				break;
			case 2:
				{
				setState(406);
				match(T__1);
				setState(407);
				match(ID);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(408);
					match(T__2);
					setState(409);
					match(ID);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(416);
				match(T__24);
				setState(417);
				match(ID);
				setState(418);
				match(T__2);
				setState(419);
				match(ID);
				setState(420);
				match(T__25);
				}
				break;
			case 4:
				{
				setState(421);
				match(T__24);
				setState(422);
				match(ID);
				setState(423);
				match(T__2);
				setState(424);
				match(ID);
				setState(425);
				match(T__2);
				setState(426);
				match(SYMBOL);
				setState(427);
				match(T__25);
				}
				break;
			case 5:
				{
				setState(428);
				state_def();
				}
				break;
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

	public static class Align_typeContext extends ParserRuleContext {
		public Align_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_align_type; }
	}

	public final Align_typeContext align_type() throws RecognitionException {
		Align_typeContext _localctx = new Align_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_align_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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

	public static class For_cycleContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ADVParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ADVParser.ID, i);
		}
		public State_defContext state_def() {
			return getRuleContext(State_defContext.class,0);
		}
		public For_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cycle; }
	}

	public final For_cycleContext for_cycle() throws RecognitionException {
		For_cycleContext _localctx = new For_cycleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_for_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__39);
			setState(434);
			match(ID);
			setState(435);
			match(T__51);
			setState(436);
			match(T__52);
			setState(437);
			match(ID);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(438);
				match(T__2);
				setState(439);
				match(ID);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			match(T__53);
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(446);
				state_def();
				setState(447);
				match(T__5);
				}
				}
				break;
			case T__4:
				{
				setState(449);
				match(T__4);
				setState(450);
				match(T__43);
				setState(451);
				state_def();
				setState(452);
				match(T__5);
				setState(453);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u01cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4"+
		"\5\4R\n\4\3\4\3\4\3\5\5\5W\n\5\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5"+
		"\3\5\3\5\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6r\n\6\f\6\16\6u\13\6\5\6w\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\5\t\u0092\n\t\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00ab\n\n\f\n\16\n\u00ae\13\n\3\n\5\n\u00b1\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00b9\n\13\f\13\16\13\u00bc\13\13\3\13\3\13\3\f\3\f"+
		"\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cc\n\f\f"+
		"\f\16\f\u00cf\13\f\3\f\3\f\7\f\u00d3\n\f\f\f\16\f\u00d6\13\f\3\f\3\f\7"+
		"\f\u00da\n\f\f\f\16\f\u00dd\13\f\3\f\5\f\u00e0\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f2\n\r\f\r\16\r\u00f5"+
		"\13\r\3\r\3\r\3\16\3\16\3\17\5\17\u00fc\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u0108\n\17\f\17\16\17\u010b\13\17\3\17"+
		"\3\17\3\17\5\17\u0110\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u011b\n\20\f\20\16\20\u011e\13\20\3\21\3\21\3\21\3\21\5\21\u0124"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\5\23\u012d\n\23\3\23\3\23\5\23"+
		"\u0131\n\23\3\23\3\23\3\23\3\23\7\23\u0137\n\23\f\23\16\23\u013a\13\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u014a\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0152\n\25\f\25\16"+
		"\25\u0155\13\25\3\26\3\26\3\26\3\26\6\26\u015b\n\26\r\26\16\26\u015c\3"+
		"\26\7\26\u0160\n\26\f\26\16\26\u0163\13\26\7\26\u0165\n\26\f\26\16\26"+
		"\u0168\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u017c\n\30\f\30\16\30\u017f\13"+
		"\30\3\30\3\30\5\30\u0183\n\30\3\30\3\30\3\30\5\30\u0188\n\30\3\31\3\31"+
		"\3\31\3\31\7\31\u018e\n\31\f\31\16\31\u0191\13\31\3\31\3\31\3\31\5\31"+
		"\u0196\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u019d\n\32\f\32\16\32\u01a0"+
		"\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u01b0\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u01bb\n\34\f\34\16\34\u01be\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01ca\n\34\3\34\2\3(\35\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\66\2\b\4\2@@BB\3\2\27\32\4\2\5\5\"\"\3"+
		"\2&\'\3\2$%\3\2/\65\2\u01eb\28\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bV\3\2\2"+
		"\2\nm\3\2\2\2\fz\3\2\2\2\16~\3\2\2\2\20\u008e\3\2\2\2\22\u009a\3\2\2\2"+
		"\24\u00b2\3\2\2\2\26\u00df\3\2\2\2\30\u00e1\3\2\2\2\32\u00f8\3\2\2\2\34"+
		"\u00fb\3\2\2\2\36\u0111\3\2\2\2 \u011f\3\2\2\2\"\u0125\3\2\2\2$\u012c"+
		"\3\2\2\2&\u013b\3\2\2\2(\u0149\3\2\2\2*\u0156\3\2\2\2,\u016b\3\2\2\2."+
		"\u0176\3\2\2\2\60\u0189\3\2\2\2\62\u01af\3\2\2\2\64\u01b1\3\2\2\2\66\u01b3"+
		"\3\2\2\28<\5\6\4\29;\5\4\3\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2="+
		"?\3\2\2\2><\3\2\2\2?@\7\2\2\3@\3\3\2\2\2AF\5\b\5\2BF\5\24\13\2CF\5*\26"+
		"\2DF\5\f\7\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\5\3\2\2\2GH\7\3"+
		"\2\2HQ\7\4\2\2IN\7>\2\2JK\7\5\2\2KM\7>\2\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QI\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\6\2"+
		"\2T\7\3\2\2\2UW\7<\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7=\2\2YZ\7B\2\2"+
		"Z^\7\7\2\2[]\5\n\6\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_g\3\2\2"+
		"\2`^\3\2\2\2ab\5\16\b\2bc\7\b\2\2cf\3\2\2\2df\5\66\34\2ea\3\2\2\2ed\3"+
		"\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\20\t\2kl"+
		"\7\t\2\2l\t\3\2\2\2mv\7\n\2\2ns\7B\2\2op\7\5\2\2pr\7B\2\2qo\3\2\2\2ru"+
		"\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vn\3\2\2\2vw\3\2\2\2w"+
		"x\3\2\2\2xy\7\b\2\2y\13\3\2\2\2z{\7\13\2\2{|\7B\2\2|}\7\b\2\2}\r\3\2\2"+
		"\2~\177\7B\2\2\177\u0080\7\f\2\2\u0080\u0081\7;\2\2\u0081\u0082\7\r\2"+
		"\2\u0082\u0089\7?\2\2\u0083\u0084\7\5\2\2\u0084\u0085\7;\2\2\u0085\u0086"+
		"\7\r\2\2\u0086\u0088\7?\2\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008d\7\16\2\2\u008d\17\3\2\2\2\u008e\u0095\7\17\2\2\u008f"+
		"\u0091\5\22\n\2\u0090\u0092\7\5\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u0099\7\b\2\2\u0099\21\3\2\2\2\u009a\u009b\7B\2\2\u009b\u009c"+
		"\7\20\2\2\u009c\u00a1\7>\2\2\u009d\u009e\7\5\2\2\u009e\u00a0\7>\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00b0\7\20\2\2\u00a5"+
		"\u00b1\7B\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00ac\7B\2\2\u00a8\u00a9\7\5\2"+
		"\2\u00a9\u00ab\7B\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b1\7\6\2\2\u00b0\u00a5\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b1\23\3\2\2"+
		"\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\7B\2\2\u00b4\u00b5\7\22\2\2\u00b5"+
		"\u00b6\7B\2\2\u00b6\u00ba\7\7\2\2\u00b7\u00b9\5\26\f\2\u00b8\u00b7\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\t\2\2\u00be\25\3\2\2"+
		"\2\u00bf\u00c3\7\23\2\2\u00c0\u00c2\5 \21\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00e0\7\b\2\2\u00c7\u00c8\5$\23\2\u00c8"+
		"\u00c9\7\b\2\2\u00c9\u00e0\3\2\2\2\u00ca\u00cc\5\36\20\2\u00cb\u00ca\3"+
		"\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00e0\7\b\2\2\u00d1\u00d3\5\34"+
		"\17\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00e0\7\b"+
		"\2\2\u00d8\u00da\5\30\r\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00e0\7\b\2\2\u00df\u00bf\3\2\2\2\u00df\u00c7\3\2\2\2\u00df"+
		"\u00cd\3\2\2\2\u00df\u00d4\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\27\3\2\2"+
		"\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3\7B\2\2\u00e3\u00e4\7\25\2\2\u00e4"+
		"\u00e5\7@\2\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\7@\2\2\u00e7\u00e8\7\26"+
		"\2\2\u00e8\u00e9\7\f\2\2\u00e9\u00ea\5\32\16\2\u00ea\u00eb\7\r\2\2\u00eb"+
		"\u00f3\t\2\2\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef\7"+
		"\r\2\2\u00ef\u00f0\t\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\16\2\2\u00f7\31\3\2\2\2\u00f8\u00f9"+
		"\t\3\2\2\u00f9\33\3\2\2\2\u00fa\u00fc\7\23\2\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\33\2\2\u00fe\u00ff\7"+
		"B\2\2\u00ff\u0100\7\5\2\2\u0100\u0101\7B\2\2\u0101\u0102\7\34\2\2\u0102"+
		"\u0103\7\35\2\2\u0103\u0104\7\f\2\2\u0104\u0105\7\36\2\2\u0105\u0109\7"+
		"\r\2\2\u0106\u0108\5\64\33\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010f\7\16\2\2\u010d\u010e\7\37\2\2\u010e\u0110\7B\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\35\3\2\2\2\u0111\u0112\7\33\2"+
		"\2\u0112\u0113\7B\2\2\u0113\u0114\7\5\2\2\u0114\u0115\7B\2\2\u0115\u0116"+
		"\7\34\2\2\u0116\u0117\7 \2\2\u0117\u011c\7B\2\2\u0118\u0119\7!\2\2\u0119"+
		"\u011b\7B\2\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\37\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120"+
		"\7B\2\2\u0120\u0121\7\37\2\2\u0121\u0123\5(\25\2\u0122\u0124\7\5\2\2\u0123"+
		"\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124!\3\2\2\2\u0125\u0126\7\25\2\2"+
		"\u0126\u0127\5(\25\2\u0127\u0128\t\4\2\2\u0128\u0129\5(\25\2\u0129\u012a"+
		"\7\26\2\2\u012a#\3\2\2\2\u012b\u012d\7#\2\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u0131\5&\24\2\u012f\u0131\7B"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0138\3\2\2\2\u0132"+
		"\u0133\7\5\2\2\u0133\u0137\7B\2\2\u0134\u0135\7\5\2\2\u0135\u0137\5&\24"+
		"\2\u0136\u0132\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139%\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7B\2\2\u013c\u013d\7\r\2\2\u013d\u013e\5(\25\2\u013e\'\3\2\2\2"+
		"\u013f\u0140\b\25\1\2\u0140\u0141\t\5\2\2\u0141\u014a\5(\25\b\u0142\u014a"+
		"\5\"\22\2\u0143\u014a\7@\2\2\u0144\u014a\7B\2\2\u0145\u0146\7\25\2\2\u0146"+
		"\u0147\5(\25\2\u0147\u0148\7\26\2\2\u0148\u014a\3\2\2\2\u0149\u013f\3"+
		"\2\2\2\u0149\u0142\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3\2\2\2\u0149"+
		"\u0145\3\2\2\2\u014a\u0153\3\2\2\2\u014b\u014c\f\t\2\2\u014c\u014d\t\6"+
		"\2\2\u014d\u0152\5(\25\n\u014e\u014f\f\7\2\2\u014f\u0150\t\5\2\2\u0150"+
		"\u0152\5(\25\b\u0151\u014b\3\2\2\2\u0151\u014e\3\2\2\2\u0152\u0155\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154)\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0156\u0157\7(\2\2\u0157\u0158\7B\2\2\u0158\u0166\7\7\2\2\u0159"+
		"\u015b\5,\27\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u0161\3\2\2\2\u015e\u0160\5.\30\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u015a\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\t\2\2\u016a+\3\2\2\2\u016b\u016c"+
		"\7)\2\2\u016c\u016d\7B\2\2\u016d\u016e\7*\2\2\u016e\u016f\7B\2\2\u016f"+
		"\u0170\7\37\2\2\u0170\u0171\5(\25\2\u0171\u0172\7!\2\2\u0172\u0173\7+"+
		"\2\2\u0173\u0174\5(\25\2\u0174\u0175\7\b\2\2\u0175-\3\2\2\2\u0176\u0177"+
		"\7,\2\2\u0177\u0178\7B\2\2\u0178\u017d\7\7\2\2\u0179\u017c\5\60\31\2\u017a"+
		"\u017c\5\66\34\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3"+
		"\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0182\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0181\7-\2\2\u0181\u0183\7\b\2\2\u0182\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0187\7\t\2\2\u0185"+
		"\u0186\7-\2\2\u0186\u0188\7\b\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188/\3\2\2\2\u0189\u018a\7.\2\2\u018a\u018f\5\62\32\2\u018b\u018c"+
		"\7\5\2\2\u018c\u018e\5\62\32\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2"+
		"\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0195\7\b\2\2\u0193\u0194\7-\2\2\u0194\u0196\7\b\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\61\3\2\2\2\u0197\u01b0\7B\2\2"+
		"\u0198\u0199\7\4\2\2\u0199\u019e\7B\2\2\u019a\u019b\7\5\2\2\u019b\u019d"+
		"\7B\2\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01b0\7\6"+
		"\2\2\u01a2\u01a3\7\33\2\2\u01a3\u01a4\7B\2\2\u01a4\u01a5\7\5\2\2\u01a5"+
		"\u01a6\7B\2\2\u01a6\u01b0\7\34\2\2\u01a7\u01a8\7\33\2\2\u01a8\u01a9\7"+
		"B\2\2\u01a9\u01aa\7\5\2\2\u01aa\u01ab\7B\2\2\u01ab\u01ac\7\5\2\2\u01ac"+
		"\u01ad\7>\2\2\u01ad\u01b0\7\34\2\2\u01ae\u01b0\5\16\b\2\u01af\u0197\3"+
		"\2\2\2\u01af\u0198\3\2\2\2\u01af\u01a2\3\2\2\2\u01af\u01a7\3\2\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0\63\3\2\2\2\u01b1\u01b2\t\7\2\2\u01b2\65\3\2\2\2\u01b3"+
		"\u01b4\7*\2\2\u01b4\u01b5\7B\2\2\u01b5\u01b6\7\66\2\2\u01b6\u01b7\7\67"+
		"\2\2\u01b7\u01bc\7B\2\2\u01b8\u01b9\7\5\2\2\u01b9\u01bb\7B\2\2\u01ba\u01b8"+
		"\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c9\78\2\2\u01c0\u01c1\5\16"+
		"\b\2\u01c1\u01c2\7\b\2\2\u01c2\u01ca\3\2\2\2\u01c3\u01c4\7\7\2\2\u01c4"+
		"\u01c5\7.\2\2\u01c5\u01c6\5\16\b\2\u01c6\u01c7\7\b\2\2\u01c7\u01c8\7\t"+
		"\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01c3\3\2\2\2\u01ca"+
		"\67\3\2\2\2\62<ENQV^egsv\u0089\u0091\u0095\u00a1\u00ac\u00b0\u00ba\u00c3"+
		"\u00cd\u00d4\u00db\u00df\u00f3\u00fb\u0109\u010f\u011c\u0123\u012c\u0130"+
		"\u0136\u0138\u0149\u0151\u0153\u015c\u0161\u0166\u017b\u017d\u0182\u0187"+
		"\u018f\u0195\u019e\u01af\u01bc\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}