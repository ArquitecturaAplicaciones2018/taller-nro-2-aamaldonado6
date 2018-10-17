package ec.edu.utpl.TallerApp.Racionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class nRacionales {


    public static void main(String[] args) {
        List<Integer> numeros= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> resultados = new ArrayList<Integer>();
        resultados = numeros.stream().filter(n -> n%2==0).collect(Collectors.toList());
        //System.out.println(resultados);


        List<Rational> var;
        var rationals = List.of(
                new Rational(1, 4),
                new Rational(1, 8),
                new Rational(3, 4),
                new Rational(7, 8));
        var menor = new Rational(1,2);

        System.out.println("Numero Menores en la lista");
        rationals.stream().filter(n -> n.isLessThan(menor)).forEach(System.out::println);

        var c = new Rational(0,1);
        Rational re = rationals.stream().reduce(c, (a, b) -> a.plus(b));
        System.out.println("Suma de todos los numeros:  "+re);


        Rational mayor =rationals.stream().reduce(c,(a,b) -> a.getGreater(b));
        System.out.println("Numero mayor en la lista: "+mayor);


        int add, prom, element, suma, me;
        element=(int)rationals.stream().count();
        System.out.println("Numeros de elementos:"+element);

        add=rationals.stream().mapToInt(n -> n.getNumerator()).reduce(0, Integer::sum);
        System.out.println("Suma numeradores:"+add);

        System.out.println("Menor numerador:"+rationals.stream().mapToInt(Rational::getNumerator).min().getAsInt());
        System.out.println("Mayor numerador:"+rationals.stream().mapToInt(Rational::getNumerator).max().getAsInt());

        System.out.println("Promedio: "+add/element);




    }

}
