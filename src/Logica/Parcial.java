package Logica;

public class Parcial {
	
	public String Raices(float a, float b, float c) {
		try {
			if (a==0) {
				throw new Exception();
			}
			
			float resp = b * b - 4 * a * c;
			if (resp < 0) {
				throw new Exception();
				
			}
			
			float raiz = (float) Math.sqrt(resp);
			
			float raiz_1 = (-b + raiz) / (2 * a);
			float raiz_2 = (-b - raiz) / (2 * a);
			
			return "x=" + raiz_1 + ", x= " + raiz_2;
			
		}
		catch (Exception e) {
			return "no se pudieron calcular las raices";
		}
	}
	

}
