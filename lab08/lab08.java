import java.io.*;

public class lab08 {

    public static void main(String[] args) throws Exception {

        // dane.txt output.txt

        try{
            if(args.length != 2)
            {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("\nPodane niepoprawne argumenty! \nWywołaj ponownie program. Przykładowo: java lab08 dane.txt wynik.txt\n");
            System.exit(1);
        }

        try{
            BufferedReader reader = new BufferedReader (new FileReader(args[0]));
            int n = 0;
            String l;
            int num;
            int sum = 0;
            double average;

            while ( (l=reader.readLine()) != null)
            {
                try {
                    num = Integer.parseInt(l);
                    n++;
					try{
						sum = Math.addExact(sum, num);
					}catch(ArithmeticException e){
						System.out.println("Wyjście poza zakres inta");
						System.exit(1);
					}
                }catch (NumberFormatException e) {
                    System.out.println("Niepoprawny format danych w pliku wejściowym");
                    System.exit(1);
                }
            }
            if ( n == 0 )
            {
                throw new IOException();
            }

            average = Double.valueOf(sum) / Double.valueOf(n);

            // System.out.println("Srednia = " + average);

			try{
				FileWriter resultFile = new FileWriter(new File(args[1]));
				resultFile.write(Double.toString(average));
				resultFile.close();
			}catch(IOException e){
				throw new OException();
			}


        }
        catch (FileNotFoundException e) {
            System.out.println("Podany plik wejściowy nie istnieje");
			System.exit(1);
        }
        catch (OException e)
        {
            System.out.println("Błąd pliku wyjściowego");
            System.exit(1);
        }
        catch (IOException e)
        {
            System.out.println("Plik wejściowy jest pusty");
            System.exit(1);
        }
		catch (Exception e)
        {
            System.out.println("Niezany wyjątek");
            System.exit(1);
        }

    }
}

class OException extends IOException {}