/* AnalizadorLexico.java */
/* Generated By:JavaCC: Do not edit this line. AnalizadorLexico.java */
class AnalizadorLexico implements AnalizadorLexicoConstants {
        public static void main ( String[] args ) throws ParseException
        {
                try{

                        AnalizadorLexico Analizador = new AnalizadorLexico (System.in) ;

                        Analizador.Iniciar() ;
                }
                catch (ParseException e){

                        System.out.println(e.getMessage()) ;
                }
        }

  static final public void Iniciar() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Letra:
      case Numero:
      case Pregunta:
      case Entonces:
      case ParenIzq:
      case ParenDer:
      case TipoDato:
      case LlaveIzq:
      case LlaveDer:
      case PuntoYComa:
      case AccesoMiembro:
      case Sustitucion:
      case SelectivaMultiple:
      case Asignar:
      case Case:
      case Metodo:
      case ClaseConsole:
      case Sobrecargar:
      case Estructura:
      case CapExcepcion:
      case Namespace:
      case Intenta:
      case Romper:
      case Base:
      case Retorno:
      case Libreria:
      case OperadorNew:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Pregunta:{
        jj_consume_token(Pregunta);
        break;
        }
      case Entonces:{
        jj_consume_token(Entonces);
        break;
        }
      case ParenIzq:{
        jj_consume_token(ParenIzq);
        break;
        }
      case ParenDer:{
        jj_consume_token(ParenDer);
        break;
        }
      case LlaveIzq:{
        jj_consume_token(LlaveIzq);
        break;
        }
      case LlaveDer:{
        jj_consume_token(LlaveDer);
        break;
        }
      case PuntoYComa:{
        jj_consume_token(PuntoYComa);
        break;
        }
      case AccesoMiembro:{
        jj_consume_token(AccesoMiembro);
        break;
        }
      case Sustitucion:{
        jj_consume_token(Sustitucion);
        break;
        }
      case SelectivaMultiple:{
        jj_consume_token(SelectivaMultiple);
        break;
        }
      case Asignar:{
        jj_consume_token(Asignar);
        break;
        }
      case Case:{
        jj_consume_token(Case);
        break;
        }
      case Metodo:{
        jj_consume_token(Metodo);
        break;
        }
      case ClaseConsole:{
        jj_consume_token(ClaseConsole);
        break;
        }
      case Sobrecargar:{
        jj_consume_token(Sobrecargar);
        break;
        }
      case Estructura:{
        jj_consume_token(Estructura);
        break;
        }
      case CapExcepcion:{
        jj_consume_token(CapExcepcion);
        break;
        }
      case Namespace:{
        jj_consume_token(Namespace);
        break;
        }
      case Intenta:{
        jj_consume_token(Intenta);
        break;
        }
      case Romper:{
        jj_consume_token(Romper);
        break;
        }
      case Base:{
        jj_consume_token(Base);
        break;
        }
      case Retorno:{
        jj_consume_token(Retorno);
        break;
        }
      case Libreria:{
        jj_consume_token(Libreria);
        break;
        }
      case OperadorNew:{
        jj_consume_token(OperadorNew);
        break;
        }
      case TipoDato:{
        jj_consume_token(TipoDato);
        break;
        }
      case Numero:{
        jj_consume_token(Numero);
        break;
        }
      case Letra:{
        jj_consume_token(Letra);
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public AnalizadorLexicoTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static private int[] jj_la1_3;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
      jj_la1_init_3();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x8000007e,0x8000007e,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0xf880607,0xf880607,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0xc007e000,0xc007e000,};
   }
   private static void jj_la1_init_3() {
      jj_la1_3 = new int[] {0x1,0x1,};
   }

  /** Constructor with InputStream. */
  public AnalizadorLexico(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public AnalizadorLexico(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AnalizadorLexicoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public AnalizadorLexico(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AnalizadorLexicoTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public AnalizadorLexico(AnalizadorLexicoTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AnalizadorLexicoTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[117];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
          if ((jj_la1_3[i] & (1<<j)) != 0) {
            la1tokens[96+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 117; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
