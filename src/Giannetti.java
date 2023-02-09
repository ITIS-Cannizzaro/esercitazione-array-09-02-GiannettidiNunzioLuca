import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Giannetti
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
					es1();
				break;
				case 2:
					es2();
				break;
				case 3:
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		
		System.out.println("1 - Es n. 1 - terzo array in ordine crescente");
		System.out.println("2 - Es n. 2 - Titolo es. esercizio 2");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	static void es1 ()
	{
		int[] numero1=new int[3];
		int[] numero2=new int[3];
		int[] numero3=new int[numero1.length+numero2.length];
		int i;
		
		for( i=0;i<numero1.length;i++)
		{
			System.out.println("inserire valore"+ numero1[i]);
			numero1[i]=Integer.parseInt(in.nextLine());
		}
		for( i=0;i<numero2.length;i++)
		{
			System.out.println("inserire valore"+ numero2[i]);
			numero2[i]=Integer.parseInt(in.nextLine());
		}
		for( i =0;i<numero1.length;i++)
		{
			numero3[i]=numero1[i];
		}
		int j;
		for( j=0;j<numero2.length;j++)
		{
			numero3[numero1.length+j]=numero2[j];
	}
		
		for(j=0;j<numero3.length;j++)
		   {
		   for(  i=0;i<numero3.length-1;i++)
		   {
			 if(numero3[i]>numero3[i+1])
					swap(numero3, i,i+1);
		   }
		   
		   }
		for(i=0;i<numero3.length;i++)
		System.out.println(numero3[i]);
		
	}
	static void es2 ()
	{
		int[] numero=new int[10];
		int secondaVariabile=0;
		for(int i=0;i<numero.length;i++)
		{
			numero[i]=(int) (Math.random()*20)-10;
			
			System.out.println(numero[i]);
			
			
		}
	for(int i = 0;i<numero.length;i++)
	{
		if(numero[i]>=0)
			secondaVariabile++;
	}
	int [] array2=new int[secondaVariabile];
	
	for(int j=0,i=0;j<numero.length;j++)
	{
		numero[j]=array2[i];
		j++;
	}
	for(int j=0;j<array2.length;j++)
	   {
	   for(  int i=0;i<array2.length-1;i++)
	   {
		 if(array2[i]<array2[i+1])
				swap(array2, i,i+1);
	   }
	   }
	
	for(int i=0;i<array2.length;i++)
		System.out.println(array2[i]);
 }
	static void swap(int[]v,int a,int b)
	  {
		
			int temp=v[a];
			v[a]=v[b];
			v[b]=temp;
	  }
}

	

	

	