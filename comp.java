/* comp.java */
/* Generated By:JavaCC: Do not edit this line. comp.java */
import java.util.*;
class comp implements compConstants {
        public static void main( String[] args )throws ParseException
        {
                try
                {
                comp Checker = new comp( System.in ) ;
                        Checker.Program();
                        System.out.println("\u005ctHabemus analizado todo.");
                }
                catch(ParseException e)
                {
                        System.err.print(e.getMessage());
                        System.out.println("\u005ctChecker ha terminado.");
                }
                catch(TokenMgrError e)
                {
                        System.err.print(e.getMessage());
                        System.out.println("\u005ctChecker ha terminado.");
                }
        }

/* || ========== || [ FINALIZA LEXICO ] || ========== || */

/* || ========== || [ INICIA SINTACTICO ] || ========== || */
  static final public 
void Program() throws ParseException {System.out.println("+==========================================+");
        System.out.println("|     Token      |=====|    Atributo       |");
        System.out.println("+==========================================+");
        boolean flag = true;
        int Tid;
        String Timage;
        List<String> ID = new ArrayList<String>();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Pregunta:
      case ParenIzq:
      case CorIzq:
      case TipoDatoNumerico:
      case TipoDatoNoNumerico:
      case MenorQue:
      case Clase:
      case TipoAcceso:
      case Do:
      case For:
      case Foreach:
      case While:
      case SelectivaMultiple:
      case FuncionString:
      case Intenta:
      case OpLogicoBoolUnitario:
      case Select:
      case Declaracion:
      case Insertar:
      case Estatico:
      case Virgulilla:
      case Caracteres:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Foreach:{
        SentenciaForeach();

        break;
        }
      case Do:{
        SentenciaDoWhile();

        break;
        }
      case While:{
        SentenciaWhile();

        break;
        }
      case For:{
        SentenciaFor();

        break;
        }
      case Pregunta:{
        SentenciaIf();

        break;
        }
      case Caracteres:{
        SentenciaLlamadaMetodo();

        break;
        }
      case ParenIzq:
      case TipoDatoNumerico:
      case TipoDatoNoNumerico:
      case TipoAcceso:
      case Estatico:{
        saSentenciaMetodo();

        break;
        }
      case Intenta:{
        SentenciaTryCatch();

        break;
        }
      case Declaracion:{
        SentenciaDeclaracion();

        break;
        }
      case Insertar:{
        SentenciaInsertarEnTabla();

        break;
        }
      case CorIzq:{
        saDeclaracionVariables();

        break;
        }
      case Clase:{
        saDeclaracionClase();

        break;
        }
      case FuncionString:{
        saMetodosReservados();

        break;
        }
      case Virgulilla:{
        saConstructorClase();

        break;
        }
      case OpLogicoBoolUnitario:{
        saDestructorClase();

        break;
        }
      case SelectivaMultiple:{
        SentenciaSwitch();

        break;
        }
      case Select:{
        SentenciaMathAgregar();

        break;
        }
      case MenorQue:{
        saProgram();
System.out.println("  saProgram" + "   \u005ct\u005ct" +  "\u005ct\u005ct     ");
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(0);
System.out.println("+===================================================+");
  }

/* || ============================== || [ INICIA COMPLEMENTOS ] || ============================== || */
  static final public 
void Condicion() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Numeros:{
      jj_consume_token(Numeros);
      break;
      }
    case Caracteres:{
      jj_consume_token(Caracteres);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(Comparador);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Numeros:{
      jj_consume_token(Numeros);
      break;
      }
    case Caracteres:{
      jj_consume_token(Caracteres);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void MasVariables() throws ParseException {
    jj_consume_token(Coma);
    jj_consume_token(Caracteres);
  }

  static final public void Parametro() throws ParseException {
    TipoDato();
    jj_consume_token(Caracteres);
  }

  static final public void InicioMetodo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TipoAcceso:{
      jj_consume_token(TipoAcceso);
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Estatico:{
      jj_consume_token(Estatico);
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      ;
    }
  }

  static final public void InicioDeclaracion() throws ParseException {
    jj_consume_token(Declaracion);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TipoCreate:{
      jj_consume_token(TipoCreate);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Dbo:{
      jj_consume_token(Dbo);
      jj_consume_token(AccesoMiembro);
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Sustitucion:{
      jj_consume_token(Sustitucion);
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      ;
    }
    jj_consume_token(Caracteres);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Asignar:{
      jj_consume_token(Asignar);
      saValores();
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      ;
    }
  }

  static final public void Palabras() throws ParseException {
    jj_consume_token(Caracteres);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Caracteres:{
        ;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        break label_2;
      }
      jj_consume_token(Caracteres);
    }
  }

  static final public void Texto() throws ParseException {
    jj_consume_token(Comillas);
    Palabras();
    jj_consume_token(Comillas);
  }

  static final public void saValores() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Comillas:{
      Texto();
      break;
      }
    case Numeros:{
      jj_consume_token(Numeros);
      break;
      }
    case NumeroDecimal:{
      jj_consume_token(NumeroDecimal);
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void EstructuraMetodo() throws ParseException {
    jj_consume_token(Caracteres);
    jj_consume_token(ParenIzq);
    SentenciaDeclaracionParametro();
    jj_consume_token(ParenDer);
    jj_consume_token(LlaveIzq);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Retorno:{
      jj_consume_token(Retorno);
      jj_consume_token(Caracteres);
      jj_consume_token(PuntoYComa);
      break;
      }
    default:
      jj_la1[12] = jj_gen;
      ;
    }
    jj_consume_token(LlaveDer);
  }

  static final public void saEstructuraMetodo() throws ParseException {
    jj_consume_token(ParenIzq);
    SentenciaDeclaracionParametro();
    jj_consume_token(ParenDer);
    jj_consume_token(Caracteres);
    BloqueCodigo();
    jj_consume_token(OrLogico);
  }

  static final public void SentenciaDeclaracionParametro() throws ParseException {
    Parametro();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Coma:{
        ;
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        break label_3;
      }
      jj_consume_token(Coma);
      Parametro();
    }
  }

  static final public void ParametroSQL() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Sustitucion:{
      jj_consume_token(Sustitucion);
      jj_consume_token(Caracteres);
      TipoDato();
      break;
      }
    case Numeros:{
      jj_consume_token(Numeros);
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void DeclaracionParametroSQL() throws ParseException {
    ParametroSQL();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Coma:{
        ;
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        break label_4;
      }
      jj_consume_token(Coma);
      ParametroSQL();
    }
  }

  static final public void TipoDatoNumerico() throws ParseException {
    ParametroSQL();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Coma:{
        ;
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        break label_5;
      }
      jj_consume_token(Coma);
      ParametroSQL();
    }
  }

  static final public void TipoDato() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TipoDatoNoNumerico:{
      jj_consume_token(TipoDatoNoNumerico);
      break;
      }
    case TipoDatoNumerico:{
      jj_consume_token(TipoDatoNumerico);
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void BloqueCodigo() throws ParseException {
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Pregunta:
      case CorIzq:
      case Do:
      case For:
      case Foreach:
      case While:
      case SelectivaMultiple:
      case FuncionString:
      case Intenta:
      case Select:
      case Declaracion:
      case Insertar:
      case Caracteres:{
        ;
        break;
        }
      default:
        jj_la1[18] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Foreach:{
        SentenciaForeach();
        break;
        }
      case Do:{
        SentenciaDoWhile();
        break;
        }
      case While:{
        SentenciaWhile();
        break;
        }
      case For:{
        SentenciaFor();
        break;
        }
      case SelectivaMultiple:{
        SentenciaSwitch();
        break;
        }
      case Pregunta:{
        SentenciaIf();
        break;
        }
      case Caracteres:{
        SentenciaLlamadaMetodo();
        break;
        }
      case Intenta:{
        SentenciaTryCatch();
        break;
        }
      case Declaracion:{
        SentenciaDeclaracion();
        break;
        }
      case Select:{
        SentenciaMathAgregar();
        break;
        }
      case Insertar:{
        SentenciaInsertarEnTabla();
        break;
        }
      case CorIzq:{
        saDeclaracionVariables();
        break;
        }
      case FuncionString:{
        saMetodosReservados();
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void saBloqueClase() throws ParseException {
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ParenIzq:
      case TipoDatoNumerico:
      case TipoDatoNoNumerico:
      case TipoAcceso:
      case Estatico:{
        ;
        break;
        }
      default:
        jj_la1[20] = jj_gen;
        break label_7;
      }
      saSentenciaMetodo();
    }
  }

  static final public void saAtributosClase() throws ParseException {
    jj_consume_token(ParenIzq);
    saDeclaracionVariables();
    jj_consume_token(ParenDer);
  }

  static final public void saLlamadaMetodo() throws ParseException {
    jj_consume_token(OrLogico);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Caracteres:{
      jj_consume_token(Caracteres);
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case Coma:{
          ;
          break;
          }
        default:
          jj_la1[21] = jj_gen;
          break label_8;
        }
        MasVariables();
      }
      break;
      }
    default:
      jj_la1[22] = jj_gen;
      ;
    }
  }

  static final public void saInicioMetodoRes() throws ParseException {
    jj_consume_token(FuncionString);
    jj_consume_token(AccesoMiembro);
  }

  static final public void BloqueCase() throws ParseException {
    jj_consume_token(Case);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Numeros:{
      jj_consume_token(Numeros);
      break;
      }
    case Comillas:{
      Texto();
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(Herencia);
    BloqueCodigo();
    jj_consume_token(Romper);
    jj_consume_token(PuntoYComa);
  }

  static final public void BloqueDefaul() throws ParseException {
    jj_consume_token(Default);
    jj_consume_token(Herencia);
    BloqueCodigo();
    jj_consume_token(Romper);
    jj_consume_token(PuntoYComa);
  }

/* || ============================== || [ FINALIZA COMPLEMENTOS ] || ============================== || */

/* SentenciaForeach [Estructura #1] */
  static final public void SentenciaForeach() throws ParseException {
    jj_consume_token(Foreach);
    jj_consume_token(ParenIzq);
    TipoDato();
    jj_consume_token(Caracteres);
    jj_consume_token(In);
    jj_consume_token(Caracteres);
    jj_consume_token(ParenDer);
    jj_consume_token(LlaveIzq);
    BloqueCodigo();
    jj_consume_token(LlaveDer);
  }

/* SentenciaDoWhile [Estructura #2] */
  static final public void SentenciaDoWhile() throws ParseException {
    jj_consume_token(Do);
    jj_consume_token(LlaveIzq);
    BloqueCodigo();
    jj_consume_token(LlaveDer);
    jj_consume_token(While);
    jj_consume_token(ParenIzq);
    Condicion();
    jj_consume_token(ParenDer);
    jj_consume_token(PuntoYComa);
  }

/* SentenciaWhile [Estructura #3] */
  static final public void SentenciaWhile() throws ParseException {
    jj_consume_token(While);
    jj_consume_token(ParenIzq);
    Condicion();
    jj_consume_token(ParenDer);
    jj_consume_token(LlaveIzq);
    BloqueCodigo();
    jj_consume_token(LlaveDer);
  }

/* SentenciaFor [Estructura #4] */
  static final public void SentenciaFor() throws ParseException {
    jj_consume_token(For);
    jj_consume_token(ParenIzq);
    jj_consume_token(TipoDatoNumerico);
    jj_consume_token(Caracteres);
    jj_consume_token(Asignar);
    jj_consume_token(Numeros);
    jj_consume_token(PuntoYComa);
    jj_consume_token(Caracteres);
    jj_consume_token(Comparador);
    jj_consume_token(Numeros);
    jj_consume_token(PuntoYComa);
    jj_consume_token(Caracteres);
    jj_consume_token(OpAritmeticoUnitario);
    jj_consume_token(ParenDer);
    jj_consume_token(LlaveIzq);
    BloqueCodigo();
    jj_consume_token(LlaveDer);
  }

/* SentenciaIf [Estructura #5] */
  static final public void SentenciaIf() throws ParseException {
    jj_consume_token(Pregunta);
    jj_consume_token(ParenIzq);
    Condicion();
    jj_consume_token(ParenDer);
    jj_consume_token(LlaveIzq);
    BloqueCodigo();
    jj_consume_token(LlaveDer);
  }

/* SentenciaLlamadaMetodo [Estructura inventada #1] */
  static final public void SentenciaLlamadaMetodo() throws ParseException {
    jj_consume_token(Caracteres);
    saLlamadaMetodo();
  }

/* saMetodoProcedimiento   [Estructura inventada #2] */
/* saMetodoFuncion   [Estructura inventada #3] */
  static final public void saSentenciaMetodo() throws ParseException {
    InicioMetodo();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ParenIzq:{
      saEstructuraMetodo();
      break;
      }
    case TipoDatoNumerico:
    case TipoDatoNoNumerico:{
      TipoDato();
      saEstructuraMetodo();
      jj_consume_token(Caracteres);
      break;
      }
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

/* SentenciaTryCatch  [Estructura #6] */
  static final public void SentenciaTryCatch() throws ParseException {
    jj_consume_token(Intenta);
    jj_consume_token(LlaveIzq);
    BloqueCodigo();
    jj_consume_token(LlaveDer);
    jj_consume_token(CapExcepcion);
    jj_consume_token(ParenIzq);
    jj_consume_token(Excepcion);
    jj_consume_token(Caracteres);
    jj_consume_token(ParenDer);
    jj_consume_token(LlaveIzq);
    BloqueCodigo();
    jj_consume_token(LlaveDer);
  }

/* SQLCreateTable 		[Estructura #7] */
/* SQLCreateDataBase 	[Estructura #8] */
/* SQLUse 				[Estructura #9] */
/* SQLInsertInto 		[Estructura #10] */
/* SQLDropTable 		[Estructura #11] */
/* SQLCreateFunction	[Estructura #12] */
/* SQLCreateView		[Estructura #13] */
/* SQLAlterTable		[Estructura #14] */
/* SQLSet				[Estructura #15] */
/* SQLCreateProcedure	[Estructura #16] */
/* SQLCreateUser		[Estructura #17] */
/* SQLCreateTrigger		[Estructura #18] */
  static final public void SentenciaDeclaracion() throws ParseException {
    InicioDeclaracion();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ParenIzq:{
      jj_consume_token(ParenIzq);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Sustitucion:
      case Numeros:{
        DeclaracionParametroSQL();
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        ;
      }
      jj_consume_token(ParenDer);
      break;
      }
    default:
      jj_la1[26] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case For:
    case As:
    case Retorno:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Retorno:{
        jj_consume_token(Retorno);
        TipoDato();
        jj_consume_token(As);
        jj_consume_token(SQLBegin);
        jj_consume_token(Retorno);
        jj_consume_token(Sustitucion);
        jj_consume_token(Caracteres);
        jj_consume_token(SQLEnd);
        break;
        }
      case As:{
        jj_consume_token(As);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case Select:{
          jj_consume_token(Select);
          jj_consume_token(Multiplicacion);
          jj_consume_token(From);
          jj_consume_token(Caracteres);
          break;
          }
        case SQLBegin:{
          jj_consume_token(SQLBegin);
          BloqueCodigo();
          jj_consume_token(SQLEnd);
          break;
          }
        default:
          jj_la1[27] = jj_gen;
          BloqueCodigo();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case Go:{
          jj_consume_token(Go);
          break;
          }
        default:
          jj_la1[28] = jj_gen;
          ;
        }
        break;
        }
      case For:{
        jj_consume_token(For);
        jj_consume_token(Login);
        jj_consume_token(Caracteres);
        break;
        }
      default:
        jj_la1[29] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[30] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PuntoYComa:{
      jj_consume_token(PuntoYComa);
      break;
      }
    default:
      jj_la1[31] = jj_gen;
      ;
    }
  }

/* SentenciaInsertarEnTabla   [Estructura #19] */
  static final public void SentenciaInsertarEnTabla() throws ParseException {
    jj_consume_token(Insertar);
    jj_consume_token(DentroDe);
    jj_consume_token(Caracteres);
    jj_consume_token(Valores);
    jj_consume_token(ParenIzq);
    saValores();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Coma:{
        ;
        break;
        }
      default:
        jj_la1[32] = jj_gen;
        break label_9;
      }
      jj_consume_token(Coma);
      saValores();
    }
    jj_consume_token(ParenDer);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PuntoYComa:{
      jj_consume_token(PuntoYComa);
      break;
      }
    default:
      jj_la1[33] = jj_gen;
      ;
    }
  }

/* SentenciaSwitch   [Estructura #20] */
  static final public void SentenciaSwitch() throws ParseException {
    jj_consume_token(SelectivaMultiple);
    jj_consume_token(ParenIzq);
    jj_consume_token(Caracteres);
    jj_consume_token(ParenDer);
    jj_consume_token(LlaveIzq);
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Case:{
        ;
        break;
        }
      default:
        jj_la1[34] = jj_gen;
        break label_10;
      }
      BloqueCase();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Default:{
      BloqueDefaul();
      break;
      }
    default:
      jj_la1[35] = jj_gen;
      ;
    }
    jj_consume_token(LlaveDer);
  }

/* SentenciasMath   	[Estructura #21] */
/* SentenciasAgregar	[Estructura #22] */
  static final public void SentenciaMathAgregar() throws ParseException {
    jj_consume_token(Select);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FuncionAgregar:{
      jj_consume_token(FuncionAgregar);
      break;
      }
    case FuncionMath:{
      jj_consume_token(FuncionMath);
      break;
      }
    default:
      jj_la1[36] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(ParenIzq);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Comillas:
    case NumeroDecimal:
    case Numeros:
    case Caracteres:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Caracteres:{
        jj_consume_token(Caracteres);
        break;
        }
      case Comillas:{
        Texto();
        break;
        }
      case NumeroDecimal:
      case Numeros:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case Numeros:{
          jj_consume_token(Numeros);
          break;
          }
        case NumeroDecimal:{
          jj_consume_token(NumeroDecimal);
          break;
          }
        default:
          jj_la1[37] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[38] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[39] = jj_gen;
      ;
    }
    jj_consume_token(ParenDer);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case PuntoYComa:{
      jj_consume_token(PuntoYComa);
      break;
      }
    default:
      jj_la1[40] = jj_gen;
      ;
    }
  }

/* || ========== || [ INICIAN INVENTADAS  ] || ========== || */


/* saBloqueClass    [Estructura inventada #4] */
  static final public void saBloqueClass() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Virgulilla:{
      saConstructorClase();
      break;
      }
    default:
      jj_la1[41] = jj_gen;
      ;
    }
    saBloqueClase();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case OpLogicoBoolUnitario:{
      saDestructorClase();
      break;
      }
    default:
      jj_la1[42] = jj_gen;
      ;
    }
  }

/* saDeclaracionVariables   [Estructura inventada #5] */
  static final public void saDeclaracionVariables() throws ParseException {
    jj_consume_token(CorIzq);
    TipoDato();
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Coma:{
        ;
        break;
        }
      default:
        jj_la1[43] = jj_gen;
        break label_11;
      }
      jj_consume_token(Coma);
      TipoDato();
    }
    jj_consume_token(CorDer);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AccesoMiembro:{
      jj_consume_token(AccesoMiembro);
      jj_consume_token(ParenIzq);
      saValores();
      label_12:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case Coma:{
          ;
          break;
          }
        default:
          jj_la1[44] = jj_gen;
          break label_12;
        }
        jj_consume_token(Coma);
        saValores();
      }
      jj_consume_token(ParenDer);
      break;
      }
    default:
      jj_la1[45] = jj_gen;
      ;
    }
    jj_consume_token(ParenIzq);
    jj_consume_token(Caracteres);
    label_13:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Coma:{
        ;
        break;
        }
      default:
        jj_la1[46] = jj_gen;
        break label_13;
      }
      jj_consume_token(Coma);
      jj_consume_token(Caracteres);
    }
    jj_consume_token(ParenDer);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Virgulilla:{
      jj_consume_token(Virgulilla);
      jj_consume_token(CorIzq);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Numeros:{
        jj_consume_token(Numeros);
        break;
        }
      case NumeroDecimal:{
        jj_consume_token(NumeroDecimal);
        break;
        }
      default:
        jj_la1[47] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(CorDer);
      break;
      }
    default:
      jj_la1[48] = jj_gen;
      ;
    }
  }

/* saMetodosReservados    [Estructura inventada #6] */
  static final public void saMetodosReservados() throws ParseException {
    saInicioMetodoRes();
    label_14:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FuncionString:{
        ;
        break;
        }
      default:
        jj_la1[49] = jj_gen;
        break label_14;
      }
      saInicioMetodoRes();
    }
    jj_consume_token(Caracteres);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Virgulilla:{
      jj_consume_token(Virgulilla);
      jj_consume_token(Caracteres);
      break;
      }
    default:
      jj_la1[50] = jj_gen;
      ;
    }
  }

/* saConstructorClase    [Estructura inventada #7] */
  static final public void saConstructorClase() throws ParseException {
    jj_consume_token(Virgulilla);
    jj_consume_token(ParenIzq);
    jj_consume_token(ParenDer);
    jj_consume_token(Caracteres);
    BloqueCodigo();
    jj_consume_token(OrLogico);
  }

/* saDestructorClase    [Estructura inventada #8] */
  static final public void saDestructorClase() throws ParseException {
    jj_consume_token(OpLogicoBoolUnitario);
    saConstructorClase();
  }

/* saDeclaracionClase   [Estructura inventada #9] */
  static final public void saDeclaracionClase() throws ParseException {
    jj_consume_token(Clase);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TipoAcceso:{
      jj_consume_token(TipoAcceso);
      break;
      }
    default:
      jj_la1[51] = jj_gen;
      ;
    }
    saAtributosClase();
    jj_consume_token(ParenIzq);
    SentenciaDeclaracionParametro();
    jj_consume_token(ParenDer);
    saBloqueClass();
    jj_consume_token(OrLogico);
    jj_consume_token(Caracteres);
  }

/* saProgram   [Estructura inventada #10] */
  static final public void saProgram() throws ParseException {System.out.println("Programa creado satisfactoriamente");
    jj_consume_token(MenorQue);
    BloqueCodigo();
    jj_consume_token(MayorQue);
    label_15:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Include:{
        ;
        break;
        }
      default:
        jj_la1[52] = jj_gen;
        break label_15;
      }
      jj_consume_token(Include);
      jj_consume_token(ParenIzq);
      jj_consume_token(Caracteres);
      jj_consume_token(ParenDer);
      jj_consume_token(PuntoYComa);
    }
    label_16:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ParenIzq:
      case TipoDatoNumerico:
      case TipoDatoNoNumerico:
      case TipoAcceso:
      case Estatico:{
        ;
        break;
        }
      default:
        jj_la1[53] = jj_gen;
        break label_16;
      }
      saSentenciaMetodo();
    }
    label_17:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Clase:{
        ;
        break;
        }
      default:
        jj_la1[54] = jj_gen;
        break label_17;
      }
      saDeclaracionClase();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public compTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[55];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static private int[] jj_la1_3;
  static private int[] jj_la1_4;
  static private int[] jj_la1_5;
  static private int[] jj_la1_6;
  static private int[] jj_la1_7;
  static private int[] jj_la1_8;
  static private int[] jj_la1_9;
  static private int[] jj_la1_10;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
      jj_la1_init_3();
      jj_la1_init_4();
      jj_la1_init_5();
      jj_la1_init_6();
      jj_la1_init_7();
      jj_la1_init_8();
      jj_la1_init_9();
      jj_la1_init_10();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1500,0x1500,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x10000,0x0,0x0,0x0,0x0,0x0,0x0,0x1100,0x1100,0x400,0x0,0x0,0x10000,0x400,0x0,0x400,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x10000,0x10000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x400,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x2020300,0x2020300,0x0,0x0,0x0,0x0,0x0,0x0,0x10000000,0x0,0x0,0x0,0x0,0x4000,0x10000000,0x4000,0x4000,0x300,0x0,0x0,0x300,0x4000,0x0,0x0,0x300,0x10000000,0x0,0x0,0x0,0x0,0x0,0x1000,0x4000,0x1000,0x0,0x0,0x0,0x0,0x0,0x0,0x1000,0x0,0x0,0x4000,0x4000,0x800000,0x4000,0x0,0x0,0x0,0x0,0x0,0x0,0x300,0x2000000,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0xbe,0xbe,0x0,0x0,0x2,0x0,0x0,0x0,0x0,0x1000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xbc,0xbc,0x2,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x8,0x8,0x0,0x0,0x0,0x2000,0x400,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x2,0x10000000,0x2,0x0,};
   }
   private static void jj_la1_init_3() {
      jj_la1_3 = new int[] {0x1000,0x1000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1000,0x1000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x200,0x200,0x0,0x0,0x0,0x0,0x0,0x40000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1000,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_4() {
      jj_la1_4 = new int[] {0x80000000,0x80000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x80000000,0x80000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_5() {
      jj_la1_5 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_6() {
      jj_la1_6 = new int[] {0x10000000,0x10000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x4,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x4,0x4,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x10000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_7() {
      jj_la1_7 = new int[] {0x40,0x40,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x40,0x40,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x40,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_8() {
      jj_la1_8 = new int[] {0x401000,0x401000,0x0,0x0,0x0,0x0,0x4,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x401000,0x401000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_9() {
      jj_la1_9 = new int[] {0x2008000,0x2008000,0x0,0x0,0x0,0x8000,0x0,0x1000000,0x0,0x0,0x0,0x80000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x8000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x10000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x80000000,0x80000000,0x80000000,0x0,0x2000000,0x0,0x0,0x0,0x0,0x0,0x80000000,0x2000000,0x0,0x2000000,0x0,0x0,0x8000,0x0,};
   }
   private static void jj_la1_init_10() {
      jj_la1_10 = new int[] {0x40,0x40,0x42,0x42,0x0,0x0,0x0,0x0,0x0,0x0,0x40,0x2,0x0,0x0,0x2,0x0,0x0,0x0,0x40,0x40,0x0,0x0,0x40,0x2,0x0,0x2,0x0,0x8,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x2,0x42,0x42,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x2,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public comp(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public comp(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new compTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public comp(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new compTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public comp(compTokenManager tm) {
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
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(compTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
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
    boolean[] la1tokens = new boolean[327];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 55; i++) {
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
          if ((jj_la1_4[i] & (1<<j)) != 0) {
            la1tokens[128+j] = true;
          }
          if ((jj_la1_5[i] & (1<<j)) != 0) {
            la1tokens[160+j] = true;
          }
          if ((jj_la1_6[i] & (1<<j)) != 0) {
            la1tokens[192+j] = true;
          }
          if ((jj_la1_7[i] & (1<<j)) != 0) {
            la1tokens[224+j] = true;
          }
          if ((jj_la1_8[i] & (1<<j)) != 0) {
            la1tokens[256+j] = true;
          }
          if ((jj_la1_9[i] & (1<<j)) != 0) {
            la1tokens[288+j] = true;
          }
          if ((jj_la1_10[i] & (1<<j)) != 0) {
            la1tokens[320+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 327; i++) {
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
