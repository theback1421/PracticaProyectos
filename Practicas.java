import java.io.*;

public class Practicas
{

    static BufferedReader entra = new BufferedReader (new InputStreamReader (System.in());
    public static void factorial ()
    {
        //Factorial de x número.
        
    }
    
    public static void palindromo ()
    {
        //Obtener el palíndromo de una palabra, ejem: oso, reconocer, etc.
        
    }
    
    public static void promedionumeros ()
    {
        //Obtener el promedio de números de N a M.
        
    }
    
    public static void masgrandearreglo ()
    {
        //Obtener el número más grande de un arreglo de 10 posiciones de números aleatorios.
        
    }
    
    public static void fibonacci ()
    {
        //Fibonacci de X número.
    }
    
    public static void maschicoarreglo ()
    {
        //Obtener el número más chico de un arreglo de 10 posiciones de números aleatorios.
    }
    
    public static void numeroprimo ()
    {
        //Saber si un número es primo o no.
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

  for(i = rInicial;i <= rFinal;i++){
  
      esPrimo=true;// 
       for(j = 2;j < i;j++){
   
   
     
       if(i % j == 0){
        
          esPrimo = false;
       }
       }
       if(esPrimo){
           
        System.out.println(i+"\n");
        suma=suma+i;
           
       }
     
  }
    System.out.println("la suma de los primos es "  + suma );
 }
    }
    
    public static void sumanam ()
    {
        //Sumanr números en un rango de N a M dados por el usuario.
    }
    
    public static void main (string args[]) throws IOException
    {
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
        while(!opcion.equals("e"));
    }
}
