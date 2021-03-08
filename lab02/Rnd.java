public class Rnd
{
	int N;
	int k;
	double tab[];
	
	Rnd(int _N, int _k)
	{
		N = _N;
		k = _k;
		tab = new double[k];
		double sum;
		double myRandomNum;
		
		for (int i = 0; i < N; i++){
			sum = 0;
			for (int j = 0; j < k; j++){
				myRandomNum =  (Math.random() * (1. - 0.)) + 0.;
				sum += myRandomNum;
			}
			tab[i] = sum;
		}
	}
	double Min()
	{
		double min = tab[0];
		for (int i = 1; i < N; i++){
			if( tab[i] < min )
				min = tab[i];
		}
		return min;
	}
	double Max()
	{
		double max = tab[0];
		for (int i = 1; i < N; i++){
			if( tab[i] > max )
				max = tab[i];
		}
		return max;
	}
	double Average()
	{
		double avg = 0.;
		for (int i = 1; i < N; i++){
			avg += tab[i];
		}
		avg = avg / N;
		
		return avg;
	}
	void Print()
	{
		for (int i = 0; i < N; i++){
			  System.out.println("[" + i + "]=" + tab[i]);
		}
	}
	void Draw()
	{
		double min = Min();
		double max = Max();
		double starTab[] = new double[N];
		double num;
		for(int i = 0; i < N; i++){
			num = ( tab[i]-min ) / ( max-min ) * 50;
			starTab[i] = Math.floor(num);
			System.out.print("[" + i + "]=");
			for (int j = 0; j < starTab[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}