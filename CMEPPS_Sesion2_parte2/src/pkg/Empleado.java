package pkg;

public class Empleado {
	public enum TipoEmpleado{Vendedor, Encargado};
	
	public float calculoNominaruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salariobase = 0, primas = 0, extras = 0;
		
		if(tipo==TipoEmpleado.Encargado)
			salariobase=2500;
		else if(tipo==TipoEmpleado.Vendedor)
			salariobase=2000;
		
		if(ventasMes>=1500)
			primas=200;
		else if(ventasMes>=1000)
			primas=100;
		
		extras=horasExtra*30;
		
		return salariobase+primas+extras;
		
	}
	
	public float calculoNominaNeta(double nominaBruta) {
		float retencion=0;
		
		if(nominaBruta>2500)
			retencion=0.18f;
		else if(nominaBruta>2000)
			retencion=0.15f;
		
		return nominaBruta*(1-retencion);
	}
}
