/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotalf;

import Controlador.Calculo;
import Controlador.Graficadora;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Kaisen
 */
public class customListener extends simpleBaseListener {

    public double a;//Aceleracion
    public double t;//Tiempo
    public double d;//Distancia
    public double x_inicial;//Posicion inicial
    public double x_final;//Posicion Final
    public double v;//Velocidad
    public double v_inicial;//Velocidad inicial
    public double v_final;//Velocidad Final

    public boolean Ba, Bt, Bd, Bxi, Bxf, Bv, Bvi, Bvf; //Verifica si fueron declarada alguna variable
    public boolean Aa, At, Ad, Axi, Axf, Av, Avi, Avf;//Booleano para verificar si la variable pregunta fue declarada
    public int Ca, Ct, Cd, Cxi, Cxf, Cv, Cvi, Cvf;//Contadores
    public int contadorUniversal;

    @Override
    public void enterStart(simpleParser.StartContext ctx) {
        Ba = false;
        Bt = false;
        Bd = false;
        Bxi = false;
        Bxf = false;
        Bv = false;
        Bvi = false;
        Bvf = false;
        Ca = Ct = Cd = Cxi = Cxf = Cv = Cvi = Cvf = 0;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitStart(simpleParser.StartContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void enterConsultas(simpleParser.ConsultasContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitConsultas(simpleParser.ConsultasContext ctx) {
        Ba = Bt = Bd = Bxi = Bxf = Bv = Bvi = Bvf = false;
        Aa = At = Ad = Axi = Axf = Av = Avi = Avf = false;
        Ca = Ct = Cd = Cxi = Cxf = Cv = Cvi = Cvf = 0;
        contadorUniversal = 0;
        a = t = d = x_inicial = x_final = v = v_inicial = v_final = 0;

    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void enterMru_cuerpo(simpleParser.Mru_cuerpoContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitMru_cuerpo(simpleParser.Mru_cuerpoContext ctx) {
        System.out.println("\nModo: MRU");
        Calculo cal = new Calculo();
        Graficadora graf = new Graficadora();

        if (Cd != 0 || Ca != 0 || Cvi != 0 || Cvf != 0) {
            System.err.println("Error 172: Existe una Variable Erronea");
        } else {
            if (Axf && contadorUniversal == 1) {
                if (Cxi > 1 || Cv > 1 || Ct > 1) {
                    System.err.println("Error 122: No se puede Repetir Variables");
                } else if (Cxi < 1) {
                    System.err.println("Error 123: No ha agregado la condicion POSICION_INICIAL");
                } else if (Cv < 1) {
                    System.err.println("Error 123: No ha agregado la condicion VELOCIDAD");
                } else if (Ct < 1) {
                    System.err.println("Error 123: No ha agregado la condicion TIEMPO");
                } else {
                    System.out.println("Posicion Inicial: " + x_inicial + " metros");
                    System.out.println("Tiempo: " + t + " segundos");
                    System.out.println("Velocidad: " + v + " m/s");
                    System.out.println("La Posicion Final es de:  " + cal.MRU_Distancia(x_inicial, v, t) + " metros");
                    graf.GraficarMRU_Distancia(x_inicial, v, t);
                }

            } else if (Av && contadorUniversal == 1) {//Si se busca la velocidad
                if (Cxi > 1 || Cxf > 1 || Ct > 1) {
                    System.err.println("Error 122: No se puede Repetir Variables");
                } else if (Cxi < 1) {
                    System.err.println("Error 123: No ha agregado la condicion POSICION_INICIAL");
                } else if (Cxf < 1) {
                    System.err.println("Error 123: No ha agregado la condicion POSICION_FINAL");
                } else if (Ct < 1) {
                    System.err.println("Error 123: No ha agregado la condicion TIEMPO");
                } else {
                    System.out.println("Posicion Inicial: " + x_inicial + " metros");
                    System.out.println("Posicion Final: " + x_final + " metros");
                    System.out.println("Tiempo: " + t + " segundos");
                    System.out.println("La Velocidad es de: " + cal.MRU_Velocidad(x_inicial, x_final, t) + " m/s");
                    graf.GraficarMRU_Velocidad(x_inicial, x_final, t);
                }

            } else if (At && contadorUniversal == 1) {//Si se busca la posicion tiempo
                if (Cxi > 1 || Cxf > 1 || Cv > 1) {
                    System.err.println("Error 122: No se puede Repetir Variables");
                } else if (Cxi < 1) {
                    System.err.println("Error 123: No ha agregado la condicion POSICION_INICIAL");
                } else if (Cxf < 1) {
                    System.err.println("Error 123: No ha agregado la condicion POSICION_FINAL");
                } else if (Cv < 1) {
                    System.err.println("Error 123: No ha agregado la condicion Velocidad");
                } else {
                    System.out.println("Posicion Inicial: " + x_inicial + " metros");
                    System.out.println("Posicion Final: " + x_final + " metros");
                    System.out.println("Velocidad: " + v + " m/s");
                    System.out.println("La Tiempo es de: " + cal.MRU_Tiempo(x_inicial, x_final, v) + " s");

                }
            } else {
                System.err.println("Error 237: No ha declarado la variable que esta buscando, o esta buscando la variable equivocada");
            }

        }

    }

    @Override
    public void enterMrua_cuerpo(simpleParser.Mrua_cuerpoContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitMrua_cuerpo(simpleParser.Mrua_cuerpoContext ctx) {
        System.out.println("\nModo: MRUA");
        Calculo cal = new Calculo();
        Graficadora graf = new Graficadora();

        if (Axf && contadorUniversal == 1) { //Si se busca la posicion final

            if (Cd != 0 || Cv != 0 || Cvf != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else if (Ca > 1 || Ct > 1 || Cxi > 1 || Cvi > 1) {
                System.err.println("Error 122: No se puede Repetir Variables");
            } else if (Ca < 1) {
                System.err.println("Error 123: No ha agregado la condicion ACELERACION");
            } else if (Ct < 1) {
                System.err.println("Error 123: No ha agregado la condicion TIEMPO");
            } else if (Cxi < 1) {
                System.err.println("Error 123: No ha agregado la condicion POSICION_INICIAL");
            } else if (Cvi < 1) {
                System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
            } else {
                System.out.println("Aceleracion: " + a + " (m/s^2)");
                System.out.println("Tiempo: " + t + " segundos");
                System.out.println("Posicion Inicial: " + x_inicial + " metros");
                System.out.println("Velocidad Inicial: " + v_inicial + " m/s");
                System.out.println("La Posicion Final es  " + cal.MRUA_Distancia(x_inicial, v_inicial, t, a) + " metros");
                graf.GraficarMRUA_Distancia(x_inicial, v_inicial, a, t);
            }

        } else if (Avf && contadorUniversal == 1) { //Si se busca la velocidad final

            if (Cd != 0 || Cxi != 0 || Cxf != 0 || Cv != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else if (Ca > 1 || Ct > 1 || Cvi > 1) {
                System.err.println("Error 122: No se puede Repetir Variables");
            } else if (Ca < 1) {
                System.err.println("Error 123: No ha agregado la condicion ACELERACION");
            } else if (Ct < 1) {
                System.err.println("Error 123: No ha agregado la condicion TIEMPO");
            } else if (Cvi < 1) {
                System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
            } else {
                System.out.println("Aceleracion: " + a + " (m/s^2)");
                System.out.println("Tiempo: " + t + " segundos");
                System.out.println("Velocidad Inicial: " + v_inicial + " m/s");
                System.out.println("La Velocidad Final es  " + cal.MRUA_Velocidad(v_inicial, a, t) + " (m/s)");
                graf.GraficarMRUA_Velocidad(v_inicial, a, t);

            }

        } else if (Aa && contadorUniversal == 1) { //Si se busca la velocidad final

            if (Cd != 0 || Cxi != 0 || Cxf != 0 || Cv != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else if (Cvf > 1 || Ct > 1 || Cvi > 1) {
                System.err.println("Error 122: No se puede Repetir Variables");
            } else if (Cvf < 1) {
                System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_FINAL");
            } else if (Ct < 1) {
                System.err.println("Error 123: No ha agregado la condicion TIEMPO");
            } else if (Cvi < 1) {
                System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
            } else {
                System.out.println("Velocidad Inicial: " + v_inicial + " m/s");
                System.out.println("Velocidad Final: " + v_final + " m/s");
                System.out.println("Tiempo: " + t + " segundos");
                System.out.println("La Aceleracion es  " + cal.MRUA_Aceleracion(v_inicial, v_final, t) + "(m/s^2) ");
                graf.GraficarMRUA_Aceleracion(v_inicial, v_final, t);
            }

        } else if (At && contadorUniversal == 1) { //Si se busca el tiempo

            if (Cd != 0 || Cxi != 0 || Cxf != 0 || Cv != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else if (Cvf > 1 || Ca > 1 || Cvi > 1) {
                System.err.println("Error 122: No se puede Repetir Variables");
            } else if (Cvf < 1) {
                System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_FINAL");
            } else if (Ca < 1) {
                System.err.println("Error 123: No ha agregado la condicion ACELERACION");
            } else if (Cvi < 1) {
                System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
            } else {
                System.out.println("Aceleracion: " + a + " (m/s^2)");
                System.out.println("Velocidad Inicial: " + v_inicial + " m/s");
                System.out.println("Velocidad Final: " + v_final + " m/s");
                System.out.println("El Tiempo es de " + cal.MRUA_Aceleracion(v_inicial, v_final, t) + " segundos");
            }

        } else {
            System.err.println("Error 237: No ha declarado la variable que esta buscando, o esta buscando la variable equivocada");
        }

    }

    @Override
    public void enterCaida_cuerpo(simpleParser.Caida_cuerpoContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitCaida_cuerpo(simpleParser.Caida_cuerpoContext ctx) {
        Calculo cal = new Calculo();
        Graficadora graf = new Graficadora();
        System.out.println("\nModo: CAIDA LIBRE");
        if (Ca != 0 || Cxi != 0 || Cxf != 0 || Cvi != 0 || Cvf != 0) {
            System.err.println("Error 172: Existe una Variable Erronea");
        } else {

            if (Ad && contadorUniversal == 1) {

                if (Ct == 1) {
                    System.out.println("Aceleracion: 9.8 (m/s^2)");
                    System.out.println("Tiempo: " + t + " segundos");
                    System.out.println("La Distancia es de: " + cal.CaidaLibre_Distancia(t) + " metros");
                    graf.GraficarCaidaLibre_Distancia(t);

                } else if (Cv == 1) {
                    System.out.println("Aceleracion: 9.8 (m/s^2)");
                    System.out.println("Velocidad: " + v + " m/s");
                    System.out.println("La Distancia es de: " + cal.CaidaLibre_Distancia2(v) + " metros");

                } else {
                    System.err.println("Error 124: No se han Agregado las Variables TIEMPO o VELOCIDAD, o tal vez agrego una Variable de mas ");
                }

            } else if (Av && contadorUniversal == 1) {

                if (Ct == 1) {
                    System.out.println("Aceleracion: 9.8 (m/s^2)");
                    System.out.println("Tiempo: " + t + " segundos");
                    System.out.println("La Velocidad es de: " + cal.CaidaLibre_Velocidad(t) + " m/s");
                    graf.GraficarCaidaLibre_Velocidad(t);

                } else if (Cd == 1) {
                    System.out.println("Aceleracion: 9.8 (m/s^2)");
                    System.out.println("Distancia: " + d + " metros");
                    System.out.println("La Velocidad es de: " + cal.CaidaLibre_Velocidad2(d) + " m/s");

                } else {
                    System.err.println("Error 124: No se han Agregado las Variables TIEMPO o DISTANCIA, o tal vez agrego una Variable de mas ");
                }

            } else if (At && contadorUniversal == 1) {

                if (Cv == 1) {
                    System.out.println("Aceleracion: 9.8 (m/s^2)");
                    System.out.println("Velocidad: " + v);
                    System.out.println("El Tiempo es de: " + cal.CaidaLibre_Tiempo(v) + " segundos");

                } else if (Cd == 1) {
                    System.out.println("Aceleracion: 9.8 (m/s^2)");
                    System.out.println("Distancia: " + d);
                    System.out.println("El Tiempo es de: " + cal.CaidaLibre_Tiempo2(d) + " segundos");

                } else {
                    System.err.println("Error 124: No se han Agregado las Variables VELOCIDAD o DISTANCIA, o tal vez agrego una Variable de mas ");
                }

            } else {
                System.err.println("Error 237: No ha declarado la variable que esta buscando, o esta buscando la variable equivocada");
            }
        }
    }

    @Override
    public void enterLva_cuerpo(simpleParser.Lva_cuerpoContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitLva_cuerpo(simpleParser.Lva_cuerpoContext ctx) {
        System.out.println("\nModo: LANZAMIENTO VERTICAL HACIA ARRIBA");
        Graficadora graf = new Graficadora();
        Calculo cal = new Calculo();

        if (Axf && contadorUniversal == 1) { //Si se busca la posicion final

            if (Ca != 0 || Cd != 0 || Cv != 0 || Cvf != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else {
                if (Ct > 1 || Cxi > 1 || Cvi > 1) {
                    System.err.println("Error 122: No se puede Repetir Variables");
                } else {
                    if (Ct < 1) {
                        System.err.println("Error 123: No ha agregado la condicion TIEMPO");

                    } else if (Cxi < 1) {
                        System.err.println("Error 123: No ha agregado la condicion POSICION_INICIAL");
                    } else if (Cvi < 1) {
                        System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
                    } else {
                        System.out.println("Aceleracion: -9.8 (m/s^2)");
                        System.out.println("Tiempo: " + t + "segundos");
                        System.out.println("Posicion inicial: " + x_inicial + " metros");
                        System.out.println("Velocidad inicial: " + v_inicial + " m/s");
                        System.out.println("La Posicion Final es de: " + cal.VerticalArriba_Distancia(x_inicial, v_inicial, t) + " metros");
                        graf.GraficarVerticalArriba_Distancia(x_inicial, v_inicial, t);

                    }
                }
            }

        } else if (Avf && contadorUniversal == 1) { //Si se busca la velocidad final

            if (Ca != 0 || Cd != 0 || Cv != 0 || Cxi != 0 || Cxf != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else {
                if (Ct > 1 || Cvi > 1) {
                    System.err.println("Error 122: No se puede Repetir Variables");
                } else {
                    if (Ct < 1) {
                        System.err.println("Error 123: No ha agregado la condicion TIEMPO");

                    } else if (Cvi < 1) {
                        System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
                    } else {
                        System.out.println("Aceleracion: -9.8 (m/s^2)");
                        System.out.println("Tiempo: " + t + "segundos");
                        System.out.println("Velocidad inicial: " + v_inicial + " m/s");
                        System.out.println("La Velocidad Final es de: " + cal.VerticalArriba_Velocidad(v_inicial, t) + " m/s");
                        graf.GraficarVerticalArriba_Velocidad(v_inicial, t);

                    }
                }
            }

        } else if (At && contadorUniversal == 1) { //Si se busca el Tiempo

            if (Ca != 0 || Cd != 0 || Cv != 0 || Cxi != 0 || Cxf != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else {
                if (Cvf > 1 || Cvi > 1) {
                    System.err.println("Error 122: No se puede Repetir Variables");
                } else {
                    if (Cvf < 1) {
                        System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_FINAL");

                    } else if (Cvi < 1) {
                        System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
                    } else {
                        System.out.println("Aceleracion: -9.8 (m/s^2)");
                        System.out.println("Velocidad inicial: " + v_inicial + " m/s");
                        System.out.println("Velocidad Final: " + v_final + " m/s");
                        System.out.println("El Tiempo es de: " + cal.VerticalArriba_Tiempo(v_inicial, v_final) + " segundos");

                    }
                }
            }

        } else {
            System.err.println("Error 237: No ha declarado la variable que esta buscando, o esta buscando la variable equivocada");
        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void enterLvab_cuerpo(simpleParser.Lvab_cuerpoContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitLvab_cuerpo(simpleParser.Lvab_cuerpoContext ctx) {
        System.out.println("\nModo: LANZAMIENTO VERTICAL HACIA ABAJO");
        Graficadora graf = new Graficadora();
        Calculo cal = new Calculo();

        if (Axf && contadorUniversal == 1) { //Si se busca la posicion final

            if (Ca != 0 || Cd != 0 || Cv != 0 || Cvf != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else {
                if (Ct > 1 || Cxi > 1 || Cvi > 1) {
                    System.err.println("Error 122: No se puede Repetir Variables");
                } else {
                    if (Ct < 1) {
                        System.err.println("Error 123: No ha agregado la condicion TIEMPO");

                    } else if (Cxi < 1) {
                        System.err.println("Error 123: No ha agregado la condicion POSICION_INICIAL");
                    } else if (Cvi < 1) {
                        System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
                    } else {
                        System.out.println("Aceleracion: 9.8 (m/s^2)");
                        System.out.println("Tiempo: " + t + " segundos");
                        System.out.println("Posicion inicial: " + x_inicial + " metros");
                        System.out.println("Velocidad inicial: " + v_inicial + " m/s");
                        System.out.println("La Posicion Final es de: " + cal.VerticalAbajo_Distancia(x_inicial, v_inicial, t) + " metros");
                        graf.GraficarVerticalAbajo_Distancia(x_inicial, v_inicial, t);

                    }
                }
            }

        } else if (Avf && contadorUniversal == 1) { //Si se busca la velocidad final

            if (Ca != 0 || Cd != 0 || Cv != 0 || Cxi != 0 || Cxf != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else {
                if (Ct > 1 || Cvi > 1) {
                    System.err.println("Error 122: No se puede Repetir Variables");
                } else {
                    if (Ct < 1) {
                        System.err.println("Error 123: No ha agregado la condicion TIEMPO");

                    } else if (Cvi < 1) {
                        System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
                    } else {
                        System.out.println("Aceleracion: 9.8 (m/s^2)");
                        System.out.println("Tiempo: " + t + " segundos");
                        System.out.println("Velocidad inicial: " + v_inicial + " m/s");
                        System.out.println("La Velocidad Final es de: " + cal.VerticalAbajo_Velocidad(v_inicial, t) + " m/s");
                        graf.GraficarVerticalArriba_Velocidad(v_inicial, t);

                    }
                }
            }

        } else if (At && contadorUniversal == 1) { //Si se busca el Tiempo

            if (Ca != 0 || Cd != 0 || Cv != 0 || Cxi != 0 || Cxf != 0) {
                System.err.println("Error 172: Existe una Variable Erronea");
            } else {
                if (Cvf > 1 || Cvi > 1) {
                    System.err.println("Error 122: No se puede Repetir Variables");
                } else {
                    if (Cvf < 1) {
                        System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_FINAL");

                    } else if (Cvi < 1) {
                        System.err.println("Error 123: No ha agregado la condicion VELOCIDAD_INICIAL");
                    } else {
                        System.out.println("Aceleracion: 9.8 (m/s^2)");
                        System.out.println("Velocidad inicial: " + v_inicial + " m/s");
                        System.out.println("Velocidad Final: " + v_final + " m/s");
                        System.out.println("El Tiempo es de: " + cal.VerticalAbajo_Tiempo(v_inicial, v_final) + " segundos");

                    }
                }
            }

        } else {
            System.err.println("Error 237: No ha declarado la variable que esta buscando, o esta buscando la variable equivocada");
        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void enterAssign(simpleParser.AssignContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitAssign(simpleParser.AssignContext ctx) {
        String asignacion = ctx.getChild(2).toString();
        if ("?".equals(asignacion)) {
            if (Ba) {

                Aa = true;
                contadorUniversal++;

            }
            if (Bt) {

                At = true;
                contadorUniversal++;

            }
            if (Bd) {

                Ad = true;
                contadorUniversal++;

            }
            if (Bxi) {

                Axi = true;
                contadorUniversal++;

            }
            if (Bxf) {

                Axf = true;
                contadorUniversal++;

            }
            if (Bv) {

                Av = true;
                contadorUniversal++;

            }
            if (Bvi) {

                Avi = true;
                contadorUniversal++;

            }
            if (Bvf) {

                Avf = true;
                contadorUniversal++;

            }

        } else {

            Double x = Double.parseDouble(asignacion);//Double.parseDouble(ctx.DOUBLE().getText());

            //Formas para verificar, cuantas veces han declarado alguna variable, en caso de hacerlo la primera vez se almacena en la varible global
            if (Ba) {

                Ca++; //Clasifica su existencia 
                a = x;
                Ba = false;

            }
            if (Bt) {

                t = x;
                Ct++;
                Bt = false;

            }
            if (Bd) {

                d = x;
                Cd++;
                Bd = false;

            }
            if (Bxi) {

                x_inicial = x;
                Cxi++;
                Bxi = false;

            }
            if (Bxf) {

                x_final = x;
                Cxf++;
                Bxf = false;

            }
            if (Bv) {

                v = x;
                Cv++;
                Bv = false;

            }
            if (Bvi) {

                v_inicial = x;
                Cvi++;
                Bvi = false;

            }
            if (Bvf) {

                v_final = x;
                Cvf++;
                Bvf = false;

            }
        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void enterVariable(simpleParser.VariableContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitVariable(simpleParser.VariableContext ctx) {
        String ACELERACION = "ACELERACION";
        String TIEMPO = "TIEMPO";
        String DISTANCIA = "DISTANCIA";
        String POS_INIC = "POSICION_INICIAL";
        String POS_FINAL = "POSICION_FINAL";
        String VELOCIDAD = "VELOCIDAD";
        String VELOCIDAD_INICIAL = "VELOCIDAD_INICIAL";
        String VELOCIDAD_FINAL = "VELOCIDAD_FINAL";

        String variable = ctx.getChild(0).getText();

        if (variable.equals(ACELERACION)) {
            Ba = true;

        }
        if (variable.equals(TIEMPO)) {
            Bt = true;

        }
        if (variable.equals(DISTANCIA)) {
            Bd = true;

        }
        if (variable.equals(POS_INIC)) {
            Bxi = true;

        }
        if (variable.equals(POS_FINAL)) {
            Bxf = true;

        }
        if (variable.equals(VELOCIDAD)) {
            Bv = true;

        }
        if (variable.equals(VELOCIDAD_INICIAL)) {
            Bvi = true;

        }
        if (variable.equals(VELOCIDAD_FINAL)) {
            Bvf = true;

        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }

}
