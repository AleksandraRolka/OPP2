
public  class lab01{
	
	public static void main(String arg[]){
		draw_line(28,65,28,84);
		draw_line(28,84,34,83);
		draw_line(34,83,38,79);
		draw_line(38,79,37,76);
		draw_line(37,76,34,73);
		draw_line(28,72,37,76);
		draw_line(58,25,53,23);
		draw_line(53,23,47,23);
		draw_line(47,23,44,25);
		draw_line(74,65,63,65);
		draw_line(63,65,73,74);
		draw_line(73,74,73,79);
		draw_line(73,79,70,82);
		draw_line(70,82,66,82);
		draw_line(66,82,63,80);
		draw_circle(50,74,9);
		draw_circle(50,29,14);
		draw_circle(55,34,2);
		draw_circle(46,34,2);
	}

		public static void draw_line(int x0, int y0, int x1, int y1){
			
			double dx = (double)(x1 - x0);
			double dy = (double)(y1 - y0);
			double len = Math.sqrt( dx * dx + dy * dy);
			int N = (int)len * 10;
			
			for(int i = 0; i < N; i++)
				System.out.println( (x0 + (dx * i) / N)+ " " + (y0 + (dy * i) / N) );
		}	
		
		public static void draw_circle(int x0, int y0, int r){
			double len = 2. * Math.PI * r;
			int N = (int)len * 10;
			
			for(int i = 0; i < N; i++){
				double alfa = 2. * Math.PI * i / N;
				System.out.println( ((double)x0 + r * Math.sin(alfa)) + " " + ((double)y0 + r * Math.cos(alfa)) );
			}
		}
}