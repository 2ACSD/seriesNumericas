/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriesnumericas;

import java.util.Scanner;

/**
 *
 * @author kondor
 */
public class SeriesNumericas {

    public static void main(String[] args) {
        String opcionMenu;
        int metodo = 0;
        Scanner sc = new Scanner(System.in);
        padovan pv = new padovan();
        pascal pc = new pascal();
        fibonacci fn = new fibonacci();
        String res;
        int res2;
        boolean respuesta = true;
        Scanner sc2 = new Scanner(System.in);

        while (true) {
            menu();
            opcionMenu = sc.nextLine();
            if (opcionMenu.equals("1")) {
                metodo = 1;
                System.out.println("**HA SELECCIONADO FIBONACCI**");

            } else if (opcionMenu.equals("2")) {
                metodo = 2;
                System.out.println("**HA SELECCIONADO PASCAL**");

            } else if (opcionMenu.equals("3")) {
                metodo = 3;
                System.out.println("**HA SELECCIONADO PADOVAN**");

            } else if (opcionMenu.equals("9")) {
                System.out.println("");
                break;

            } else {
                System.out.println("");
                System.out.println("Opcion seleccionada invalida\nIngresa una opcion correcta...\n");
                continue;

            }
            System.out.println("");
            opciones(metodo);

        }
    }

    static void menu() {
        System.out.println("Selecciona una opción");
        System.out.println("\t1 - Algoritmo de Fibonacci");
        System.out.println("\t2 - Algoritmo de Pascal");
        System.out.println("\t3 - Algoritmo de Padovan");
        System.out.println("\t9 - salir");
    }

    static void opciones(int metodo) {
        Scanner sc2 = new Scanner(System.in);
        boolean salida = true;
        String res;
        int res2;
        boolean respuesta;
        String x="1";

        while (salida != false) {
            if (x.equals("1")) { 

                if (metodo == 1) {
                    fibonacci fn = new fibonacci();
                    respuesta = true;
                    while (respuesta == true) {
                        System.out.print("Introduce limite de Fibonacci(maximo: 3 digitos)\n");
                        res = sc2.nextLine();
                        if (isNumeric(res) == true) {
                            if (res.length() >= 4) {
                                System.out.println("Solo se permite ingresar 3 digitos\n");

                            } else {
                                res2 = Integer.parseInt(res);
                                fn.fibonacci(res2);
                                respuesta = false;
                                keep();
                               
                                
                            }
                        } else {
                            System.out.println("No se permiten letras, ni cantidad mayor a 3 digitos, ingresa solo numeros");
                            continue;

                        }
                         x = sc2.nextLine();
                    }

                } else if (metodo == 2) {
                    pascal pc = new pascal();
                    respuesta = true;
                    while (respuesta == true) {
                        System.out.print("Introduce limite de Pascal(maximo: 3 digitos)\n");
                        res = sc2.nextLine();
                        if (isNumeric(res) == true) {
                            if (res.length() >= 4) {
                                System.out.println("Solo se permite ingresar 3 digitos\n");

                            } else {
                                res2 = Integer.parseInt(res);
                                pc.pascal(res2);
                                respuesta = false;
                                keep();
                                
                            }
                        } else {
                            System.out.println("No se permiten letras, ni cantidad mayor a 3 digitos, ingresa solo numeros");
                            continue;

                        }
                        x = sc2.nextLine();
                    }
                } else {
                    padovan pv = new padovan();
                    respuesta= true;
                    while (respuesta == true) {
                        System.out.print("Introduce limite de Padovan(maximo: 3 digitos)\n");
                        res = sc2.nextLine();
                        if (isNumeric(res) == true) {
                            if (res.length() >= 4) {
                                System.out.println("Solo se permite ingresar 3 digitos\n");

                            } else {
                                res2 = Integer.parseInt(res);
                                pv.padovan(res2);
                                respuesta = false;
                                keep();
                                
                            }
                        } else {
                            System.out.println("No se permiten letras, ni cantidad mayor a 3 digitos, ingresa solo numeros");
                            continue;

                        }
                        x = sc2.nextLine();
                    }

                }

            } else if (x.equals("2")) {
                salida = false;

            } else if (!x.equals("1") || !x.equals("2")) {
                System.out.println("\nPROGRAMA FINALIZADO\n");
                System.exit(0);
            }
            
        }

    }

    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public static void keep() {
        System.out.println("\nOTRO LIMITE(1)        MENU(2)        **Para salir del programa ingresa un numero o letra diferente a '1' o '2'**");

    }

}
