package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); // autoboxing
        System.out.println(idadeRef.intValue()); // unboxing

        Double dRef = Double.valueOf(3.2); // autoboxing
        System.out.println(dRef.doubleValue()); // unboxing

        Boolean bRefFalse = Boolean.FALSE;
        System.out.println(bRefFalse.booleanValue());

        Number numberto1 = Integer.valueOf(29);
        Number numberto2 = Double.valueOf(3.2);
        Number numberto3 = Float.valueOf(3.2f);

        List<Number> listaNumeros = new ArrayList<>();
        listaNumeros.add(24);
        listaNumeros.add(5.4);
        listaNumeros.add(56.9f);
        System.out.println(listaNumeros);

/**
 * NUMBNER -
 *          Double
 *          Float
 *          Long
 *          Shord
 *          Integer
 *          Byte
 */
    }
}
