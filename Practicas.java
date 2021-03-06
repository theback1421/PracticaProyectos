import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Practicas
    
{

    static BufferedReader entra = new BufferedReader (new InputStreamReader(System.in));
    public static void factorial ()
    {
        //Factorial de x número.
        
    }
    
    public static void palindromo ()
    {
        Scanner entrada = new Scanner(System.in);
        int pos = 0;
        StringBuffer frase, inversa;
        String s1, s2;
        System.out.println("Introduzca una palabra");
        frase = new StringBuffer(entrada.nextLine());
        while (pos < frase.length())
        {
            if (!Character.isLetter(frase.charAt(pos)))
            {
                frase.deleteCharAt(pos);
            } 
            else 
            {
                pos++;
            }
        }
        inversa = new StringBuffer(frase);
        inversa.reverse();
        s1 = frase.toString();
        s2 = inversa.toString();
        if (s1.equalsIgnoreCase(s2)) 
        {
            System.out.println("La palabra introducida es un palíndromo.");
        }
        else 
        {
            System.out.println("La palabra introducida no es un palíndromo.");
        }
    }
    
    public static void promedionumeros ()
    {
        //Obtener el promedio de números de N a M.
            Scanner in = new Scanner(System.in);
        int x; 
        int i; 
        int suma=0;
        double promedio;
        System.out.println("Digite la cantidad de numeros");
        x = Integer.parseInt(in.next());
            for(i = 0;i < x;i++){  
                System.out.println("Digite un numero"); 
                suma = suma + Integer.parseInt(in.next()); 
            } promedio = suma/x; 
        System.out.println("El promedio de los numeros es: "+promedio);  
        
    }
    
    public static void masgrandearreglo ()
    {
        //Obtener el número más grande de un arreglo de 10 posiciones de números aleatorios.
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int numeromasgrande = 0;    
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero ");
            numero = sc.nextInt();
            if (numero > numeromasgrande) {
                numeromasgrande = numero;
            }
        }
        System.out.println("el numero mas grande del arreglo es " + numeromasgrande);
    }
    
    public static void fibonacci ()
    {
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        do
        {
            System.out.print("Ingrese un numero mayor que 1: ");
            numero = sc.nextInt();
        }
        while(numero<=1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 

        fibo1=1;
        fibo2=1; 

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++)
        {
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
        //Fibonacci de X número.
    }
    
    public static void maschicoarreglo ()
    {
        Random  rnd = new Random();
      int menor;
      int arre[]= new int[10];
        for (int i = 0; i < 10; i++) {
            arre[i]=rnd.nextInt(99);
            System.out.println(" "+arre[i]);
        }
        menor=arre[0];
        for (int i = 1; i < arre.length; i++) {
            if(arre[i]<menor){
                menor=arre[i];
            }
        }
        System.out.println("El numero menor es: "+menor);
    }
    
    public static void numeroprimo ()
    {
        //Saber si un número es primo o no.
        int i,j=0;
        boolean esPrimo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int numero =sc.nextInt();
        for(i=1; i<=numero; i++)
        {
            if(numero%i==0)
            {
                j++;
            }
        }
        if(j==2)
        {
            System.out.println("Numero primo");
        }else
        {
            System.out.println("numero no primo");
        }
    }
    
    public static void sumaprimosnam ()
    {
        int i,j,suma=0;
        boolean esPrimo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el rango inicial");
        int rInicial=sc.nextInt();
        System.out.println("Dame el rango final");
        int rFinal=sc.nextInt();
        //Rango inicial, este debe ser mayor de 1.

        for(i = rInicial;i <= rFinal;i++)
        {
            esPrimo=true;// 
            for(j = 2;j < i;j++)
            {
                if(i % j == 0)
                {
                    esPrimo = false;
                }
            }
            if(esPrimo)
            {
                System.out.println(i+"\n");
                suma=suma+i;
            }
        }
        System.out.println("la suma de los primos es "  + suma );
    }
    
    
    public static void sumanam ()throws IOException
    {
        //Sumanr números en un rango de N a M dados por el usuario.
        System.out.println("Dame el rango inicial: ");
        int ini = Integer.parseInt(entra.readLine());
        System.out.println("Dame el rango final: ");
        int fin = Integer.parseInt(entra.readLine());
        int suma = 0;
        for(int i=ini; i<=fin; i++)
        {
            suma = suma + i;
        }
        System.out.println("La suma es: "+suma);
    }
    
    public static void main (String args[]) throws IOException
    {
        String opcion = "";
        do
        {
            System.out.println("Factorial de un número........[1]");
            System.out.println("Palíndromo....................[2]");
            System.out.println("Promedio de números de N a M..[3]");
            System.out.println("Número más grande de arreglo..[4]");
            System.out.println("Fibonacci.....................[5]");
            System.out.println("Número más chico de arreglo...[6]");
            System.out.println("Número primo..................[7]");
            System.out.println("Suma números primos de N a M..[8]");
            System.out.println("Suma números de N a M.........[9]");
            System.out.println("Salir.........................[e]");
            opcion= entra.readLine();
            if(opcion.equals("1"))
            {
                factorial();
            }
            if(opcion.equals("2"))
            {
                palindromo();
            }
            if(opcion.equals("3"))
            {
                promedionumeros();
            }
            if(opcion.equals("4"))
            {
                masgrandearreglo();
            }
            if(opcion.equals("5"))
            {
                fibonacci();
            }
            if(opcion.equals("6"))
            {
                maschicoarreglo();
            }
            if(opcion.equals("7"))
            {
                numeroprimo();
            }
            if(opcion.equals("8"))
            {
                sumaprimosnam();
            }
            if(opcion.equals("9"))
            {
                 sumanam();
            }
        }
        while(!opcion.equals('e'));
    }
}
